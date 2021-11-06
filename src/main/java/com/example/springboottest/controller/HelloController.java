package com.example.springboottest.controller;

import com.example.springboottest.util.SpringUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "HelloController")
public class HelloController {

    @GetMapping("/sayHello")
//    @GetMapping("/hello")
    public String get(){
        log.info("Processing trade with param1:[{}] and param2: [{}] ", "参数1", "参数2");
        return "helo tungee";
    }


    @GetMapping("/testSpringUtil")
    public Object testSpringUtil1() {
        return SpringUtil.getBean("testDemo");
    }
}
