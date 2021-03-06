package com.example.springboottest.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName MyRedissonConfig.java
 * @Description TODO
 * @createTime 2021年08月11日 16:20:00
 */
@Configuration
public class MyRedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:6379");
        config.useSingleServer().setPassword("123456");
        return Redisson.create(config);
    }
}
