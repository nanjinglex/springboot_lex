package com.example.springboottest.springboot2;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName RegCenter.java
 * @Description TODO
 * @createTime 2021年11月25日 15:16:00
 */
@Component
@ConfigurationProperties(prefix = "car")
@Data
public class Car {
    private String brand;
    private String price;
}
