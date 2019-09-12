package com.soring.consumerfeign.controller;

import com.soring.consumerfeign.feignClient.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud/consumer/feign/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;//此标红不必理会，该bean是在运行时加载

    @RequestMapping("/hi")
    public String hello(@RequestParam("name") String name){
        return helloService.helloName(name);
    }

}
