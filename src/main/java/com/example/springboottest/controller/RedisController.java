package com.example.springboottest.controller;

import com.alibaba.fastjson.JSON;
import com.mchange.lang.ShortUtils;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * 缓存穿透
 * 缓存穿透指的是查询一个一定不存在的数据，由于缓存是不命中时需要从数据库查询，查不到数据则不写入缓存，这将导致这个不存在的数据每次请求都要到数据库去查询，进而给数据库带来压力。因为缓存是帮助数据库分担压力的，但若是让某些人知道了系统中哪些数据是一定不存在的，那么它就可以利用这个数据不停地发送大量请求，从而击垮我们的系统。解决方案是不管这个数据是否存在，都对其进行存储，比如某个请求需要的数据是不存在的，那么仍然将这个数据的key进行存储，这样下次请求时就可以从缓存中获取，但若是每次请求数据的key均不同，那么Redis中就会存储大量无用的key，所以应该为这些key设置一个指定的过期时间，到期自动删除即可。
 * <p>
 * 缓存雪崩
 * 缓存雪崩是指缓存中数据大批量地同时过期，而查询数据量巨大，引起数据库压力过大甚至宕机。解决的办法是在数据原有的过期时间上增加一个随机值，这样可以使数据之间的过期时间不一致，也就不会出现数据大批量同时过期的情况。
 * <p>
 * 缓存击穿
 * 缓存击穿是指热点key在某个时间点过期的时候，而恰好在这个时间点对这个Key有大量的并发请求过来，从而大量的请求打到db。解决的办法是加锁，当某个热点key过期时，大量的请求会进行资源竞争，当某个请求成功执行时，其它请求就需要等待，此时该请求执行完成后就会将数据放入缓存，这样别的请求就可以直接从缓存中获取数据了。
 */

/**
 * @author lex
 * @version 1.0.0
 * @ClassName RedisController.java
 * @Description TODO
 * @createTime 2021年08月11日 11:12:00
 */
@RestController
@RequestMapping("/redis")
@Slf4j
public class RedisController {

    Map<String, Object> cache = new HashMap<>();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    /**
     * 存在缓存击穿问题，高并发情况下会多次查询数据库
     *
     * @return
     */
    @GetMapping("/test")
    public String test() {
        // 从Redis中获取数据
        String usersJson = redisTemplate.opsForValue().get("users");
        if (StringUtils.isEmpty(usersJson)) {
            // 未命中缓存，查询数据库
            String sql = "select * from sys_user";
            List<Map<String, Object>> users = jdbcTemplate.queryForList(sql);
            System.out.println("查询了数据库......");
            // 将查询结果转成json字符串
            usersJson = JSON.toJSONString(users);
            // 放入缓存
            redisTemplate.opsForValue().set("users", usersJson);
        }
        // 返回结果
        return usersJson;
    }

    /**
     * 解决缓存击穿问题
     * 对于缓存穿透和缓存雪崩，我们都能够非常轻松地解决，然而缓存击穿问题需要加锁来解决，我们就来探究一下如何加锁解决缓存击穿问题。
     * <p>
     * 首先仍然需要从缓存中获取数据，若未命中缓存，则执行同步代码块，在同步代码块中又进行了缓存数据的确认。这是因为当大量的请求同时进入了最外层的if语句中，此时某个请求开始执行，并成功查询了数据库，但是在该请求将数据放入Redis之后，如果不再次进行判断，那么这些请求仍然还是会去查询数据库，其执行原理如下所示
     * <p>
     * 单体应用没问题，分布式环境仍然存在问题
     *
     * @return
     */
    @GetMapping("/testJichuan")
    public String testJichuan() {
        // 从Redis中获取数据
        String usersJson = redisTemplate.opsForValue().get("users");
        if (StringUtils.isEmpty(usersJson)) {
            synchronized (this) {
                // 再次确认缓存中是否有数据
                String json = redisTemplate.opsForValue().get("users");
                if (StringUtils.isEmpty(json)) {
                    // 未命中缓存，查询数据库
                    String sql = "select * from sys_user";
                    List<Map<String, Object>> users = jdbcTemplate.queryForList(sql);
                    System.out.println("查询了数据库......");
                    // 将查询结果转成json字符串
                    usersJson = JSON.toJSONString(users);
                } else {
                    usersJson = json;
                }
                // 放入缓存
                redisTemplate.opsForValue().set("users", usersJson);
            }
        }
        // 返回结果
        return usersJson;
    }

    /**
     * 分布式锁
     * @return
     * @throws InterruptedException
     * 存在问题 1.程序异常，锁没释放，导致死锁（解决：设置锁的过期时间）
     *          2.即使设置过期时间，当前请求业务处理时间大于锁的过期时间，没处理完锁就没有了，新请求会新占有锁（创建锁），上一个请求继续执行，会删除新请求的锁（解决：解决方案是让每个请求占用的锁都是独有的，某个请求不能随意地去删除其它请求的锁）
     */

    @GetMapping("/testDistributedLock")
    public String testDistributedLock() throws InterruptedException {
        String usersJson = redisTemplate.opsForValue().get("users");
        if (StringUtils.isEmpty(usersJson)) {
            usersJson = getUsersJson();
        }
        return usersJson;
    }

    public String getUsersJson() throws InterruptedException {
        String usersJson = "";
        // 抢占分布式锁
        Boolean lock = redisTemplate.opsForValue().setIfAbsent("lock", "1");
        log.info("是否抢到lock:{}", lock ? "是" : "否");
        if (lock) {
            // 占锁成功
            // 再次确认缓存中是否有数据
            String json = redisTemplate.opsForValue().get("users");
            if (StringUtils.isEmpty(json)) {
                // 未命中缓存，查询数据库
                String sql = "select * from sys_user";
                List<Map<String, Object>> users = jdbcTemplate.queryForList(sql);
                System.out.println("查询了数据库......");
                usersJson = JSON.toJSONString(users);
            } else {
                usersJson = json;
            }
            redisTemplate.opsForValue().set("users", usersJson);
            // 释放锁
            redisTemplate.delete("lock");
        } else {
            // 占锁失败，触发重试机制
            Thread.sleep(200);
            // 重复调用自身
            getUsersJson();
        }
        return usersJson;
    }

    /**
     * 解决：解决方案是让每个请求占用的锁都是独有的，某个请求不能随意地去删除其它请求的锁
     * 注意：锁的过期时间要大于业务处理时间
     * @return
     * @throws InterruptedException
     * 仔细想想，这里仍然是有问题存在的，因为在释放锁时，Java程序会向Redis发送指令，Redis执行完成后并将结果返回给Java程序，在网络传输过程中都会消耗时间。假设此时Java程序向Redis获取lock的值，Redis成功将值返回，但在返回过程中锁过期了，此时别的请求将可以占有锁，这时候Java程序接收到了lock的值，比较发现是自己的锁，于是执行删除操作，但此时Redis中的锁已经是别的请求的锁了，这样还是出现了某个请求删除了其它请求的锁的问题。
     */
    @GetMapping("/testDistributedLockUUid")
    public String testDistributedLockUUid() throws InterruptedException {
        String usersJson = redisTemplate.opsForValue().get("users");
        if (StringUtils.isEmpty(usersJson)) {
            usersJson = getUsersJsonUUid();
        }
        return usersJson;
    }
    public String getUsersJsonUUid() throws InterruptedException {
        String usersJson = "";
        // 抢占分布式锁
        String uuid = UUID.randomUUID().toString();
        Boolean lock = redisTemplate.opsForValue().setIfAbsent("usersDistributedLockUUid", uuid,10, TimeUnit.SECONDS);
        log.info("是否抢到lock:{}", lock ? "是" : "否");
        if (lock) {
            // 占锁成功
            // 再次确认缓存中是否有数据
            String json = redisTemplate.opsForValue().get("users");
            if (StringUtils.isEmpty(json)) {
                String sql = "select * from sys_user";
                List<Map<String, Object>> users = jdbcTemplate.queryForList(sql);
                System.out.println("查询了数据库......");
                usersJson = JSON.toJSONString(users);
            } else {
                usersJson = json;
            }
            redisTemplate.opsForValue().set("users", usersJson);
            // 判断当前锁是否为自己的锁
            String lockVal = redisTemplate.opsForValue().get("usersDistributedLockUUid");
            if (uuid.equals(lockVal)) {
                // 如果是自己的锁，才能释放锁
                redisTemplate.delete("usersDistributedLockUUid");
            }
        } else {
            // 占锁失败，触发重试机制
            Thread.sleep(200);
            getUsersJsonUUid();
        }
        return usersJson;
    }

    /**
     * 解决上述问题。Redis官网也给出了解决方案：
     *Lua脚本
     * @return
     * @throws InterruptedException
     */
    @GetMapping("/testDistributedLockUUidLua")
    public String testDistributedLockUUidLua() throws InterruptedException {
        String usersJson = redisTemplate.opsForValue().get("users");
        if (StringUtils.isEmpty(usersJson)) {
            usersJson = getUsersJsonUUidLua();
        }
        return usersJson;
    }
    public String getUsersJsonUUidLua() throws InterruptedException {
        String usersJson = "";
        // 抢占分布式锁
        String uuid = UUID.randomUUID().toString();
        Boolean lock = redisTemplate.opsForValue().setIfAbsent("lock", uuid,3, TimeUnit.SECONDS);
        log.info("是否抢到lock:{}", lock ? "是" : "否");
        if (lock) {
            // 占锁成功
            // 再次确认缓存中是否有数据
            String json = redisTemplate.opsForValue().get("users");
            if (StringUtils.isEmpty(json)) {
                String sql = "select * from sys_user";
                List<Map<String, Object>> users = jdbcTemplate.queryForList(sql);
                System.out.println("查询了数据库......");
                usersJson = JSON.toJSONString(users);
            } else {
                usersJson = json;
            }
            redisTemplate.opsForValue().set("users", usersJson);
            String luaScript = "if redis.call(\"get\",KEYS[1]) == ARGV[1]\n" +
                    "then\n" +
                    "    return redis.call(\"del\",KEYS[1])\n" +
                    "else\n" +
                    "    return 0\n" +
                    "end";
            // 执行脚本
            DefaultRedisScript<Long> redisScript = new DefaultRedisScript<>(luaScript, Long.class);
            List<String> keyList = Arrays.asList("lock");
            redisTemplate.execute(redisScript, keyList, uuid);
        } else {
            // 占锁失败，触发重试机制
            Thread.sleep(200);
            getUsersJsonUUidLua();
        }
        return usersJson;
    }



    @GetMapping("/testRedisson")
    public String testRedisson() {
        // 占用锁
        RLock lock = redissonClient.getLock("my_lock");
        // 加锁
        lock.lock();
        try {
            // 模拟业务处理
            Thread.sleep(1000 * 10);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放锁
            lock.unlock();
        }
        return "test";
    }



    @GetMapping("/testRedissonGetUser")
    public String testRedissonGetUser() {
        // 从Redis中获取数据
        String usersJson = redisTemplate.opsForValue().get("users");
        if (StringUtils.isEmpty(usersJson)) {
            // 占用锁
            RLock lock = redissonClient.getLock("my_lock");
            // 加锁
            lock.lock();
            try {
                // 未命中缓存，查询数据库
                String sql = "select * from sys_user";
                List<Map<String, Object>> users = jdbcTemplate.queryForList(sql);
                System.out.println("查询了数据库......");
                // 将查询结果转成json字符串
                usersJson = JSON.toJSONString(users);
                // 放入缓存
                redisTemplate.opsForValue().set("users", usersJson);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 释放锁
                lock.unlock();
            }

        }
        // 返回结果
        return usersJson;
    }



}
