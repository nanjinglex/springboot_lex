package com.example.springboottest.springboot2;

import org.apache.log4j.helpers.LogLog;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName myCongfig.java
 * @Description
 * @createTime 2021年11月25日 11:12:00
 */
@ImportResource("classpath:beans.xml")
@Import({Dog.class, LogLog.class})
@Configuration(proxyBeanMethods = false)//默认true 所有单例
public class MyCongfig {

    @Bean
    public String dogName(){
        return new String("go");
    }

    @Bean
    public Dog myDog(){
        Dog dog = new Dog(dogName());
        return dog;
    }


    @Bean
    public String myCat(){
        return new String("cat");
    }

    @ConditionalOnBean(name={"myCat"})
    @Bean
    public String catName(){
        return new String("miaomiao");
    }


}
