package com.example.springboottest.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class RedisController {

    Map<String, Object> cache = new HashMap<>();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 存在缓存击穿问题，高并发情况下会多次查询数据库
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
     *
     * @return
     */
    @GetMapping("/testJichuan")
    public String testJichuan() {
        // 从Redis中获取数据
        String usersJson = redisTemplate.opsForValue().get("usersjichuan");
        if (StringUtils.isEmpty(usersJson)) {
            synchronized (this) {
                // 再次确认缓存中是否有数据
                String json = redisTemplate.opsForValue().get("usersjichuan");
                if(StringUtils.isEmpty(json)){
                    // 未命中缓存，查询数据库
                    String sql = "select * from sys_user";
                    List<Map<String, Object>> users = jdbcTemplate.queryForList(sql);
                    System.out.println("查询了数据库......");
                    // 将查询结果转成json字符串
                    usersJson = JSON.toJSONString(users);
                }else{
                    usersJson = json;
                }
                // 放入缓存
                redisTemplate.opsForValue().set("usersjichuan",usersJson);
            }
        }
        // 返回结果
        return usersJson;
    }

}
