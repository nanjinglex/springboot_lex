package com.example.springboottest.controller;

import com.example.springboottest.util.SpringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/sayHello")
//    @GetMapping("/hello")
    public String get(){
        return "helo tungee";
    }


    @GetMapping("/testSpringUtil")
    public Object testSpringUtil1() {
        return SpringUtil.getBean("testDemo");
    }
}
