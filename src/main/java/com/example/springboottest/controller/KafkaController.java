package com.example.springboottest.controller;

import com.example.springboottest.kafka.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/kafka")
@Controller
@Slf4j
public class KafkaController {
    @Autowired
    private KafkaProducer kafkaProducer;



    @RequestMapping("/send")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public void send(){
        kafkaProducer.send("this is a kafka test message!!!!");
    }
}
