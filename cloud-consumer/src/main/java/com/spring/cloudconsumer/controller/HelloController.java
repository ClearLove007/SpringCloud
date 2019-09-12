package com.spring.cloudconsumer.controller;

import com.spring.cloudconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud/consumer")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hiService(@RequestParam("name") String name){
        return  helloService.hiService(name);
    }
}
