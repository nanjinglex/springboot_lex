package com.example.springboottest.pojo;

import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DynamicDataSourceProperties;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName MyProperties.java
 * @Description TODO
 * @createTime 2021年06月23日 16:13:00
 */
@Slf4j
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = DynamicDataSourceProperties.PREFIX)
public class MyProperties {
    public static final String PREFIX = "spring.datasource.dynamic";
    public static final String HEALTH = PREFIX + ".health";
    public static final String DEFAULT_VALID_QUERY = "SELECT 1";
    /**
     * 必须设置默认的库,默认master
     */
    private String primary;

    public static void main(String[] args) {
        System.out.println(new MyProperties().getPrimary());
    }
}
