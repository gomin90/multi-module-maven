package com.beginsecure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beginsecure.producer.TestkafkaProducer;

@Controller
public class TestController {

    @Autowired
    private TestkafkaProducer producer;

    @GetMapping("/test")
    @ResponseBody
    public String getTestArgs(@RequestParam(required = false) String param) {
        return new String("test :" + param);
    }

    @GetMapping("/testkafka")
    @ResponseBody
    public String getkafka(@RequestParam(required = false) String param) {
        producer.sendMessage(param, param); 
        return new String("run ????????");
    }
    
}
