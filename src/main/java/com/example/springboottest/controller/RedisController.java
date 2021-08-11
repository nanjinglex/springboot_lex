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


    @GetMapping("/test")
    public String test() {
        // 从Redis中获取数据
        String usersJson = redisTemplate.opsForValue().get("users");
        if (StringUtils.isEmpty(usersJson)) {
            // 未命中缓存，查询数据库
            String sql = "select * from sys_user";
            List<Map<String, Object>> users =  jdbcTemplate.queryForList(sql);
            // 将查询结果转成json字符串
            usersJson = JSON.toJSONString(users);
            // 放入缓存
            redisTemplate.opsForValue().set("users",usersJson);
        }
        // 返回结果
        return usersJson;
    }

}
