package com.example.springboottest.controller;

import com.example.springboottest.kafka.KafkaProducer;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "DbController模块")
@RequestMapping("/kafka")
@RestController
@Slf4j
public class KafkaController {
    @Autowired
    private KafkaProducer kafkaProducer;



    @GetMapping("/send")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public void send(){
        kafkaProducer.send("this is a kafka test message!!!!");
    }
}
