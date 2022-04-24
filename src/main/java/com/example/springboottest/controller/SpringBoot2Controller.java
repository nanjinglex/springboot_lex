package com.example.springboottest.controller;

import com.example.springboottest.pojo.MyProperties;
import com.example.springboottest.springboot2.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName SpringBoot2Controller.java
 * @Description
 * @createTime 2021年11月25日 15:19:00
 */
@RestController
@RequestMapping("/boot2")
public class SpringBoot2Controller {
    @Autowired
    private MyProperties myProperties;
    @Autowired
    private Car car;

    @GetMapping("/getMyProperties")
    public MyProperties getMyProperties(){
        return  myProperties;
    }

    @GetMapping("/getCar")
    public Car getCar(){
        return car;
    }
}
