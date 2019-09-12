package com.spring.cloudclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Value("${server.port}")
    private String port;

    public String helloService(String name){
        return "Hello,"+name+" i am port:"+port;
    }
}
