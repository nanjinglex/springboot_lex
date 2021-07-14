package com.example.springboottest.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName BeanConfig.java
 * @Description TODO
 * @createTime 2021年07月02日 17:54:00
 */
@Configuration
public class BeanConfig {
    @Bean(name="testDemo")
    public Demo2 generateDemo() {
        Demo2 demo = new Demo2();
        demo.setId(12345);
        demo.setName("test");
        return demo;
    }
}
