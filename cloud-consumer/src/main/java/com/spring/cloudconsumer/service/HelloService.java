package com.spring.cloudconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String hiService(String name){
        return restTemplate.getForObject("http://cloud-client/cloud/client/hello?name="+name,String.class);
    }

    public String error(String str){
        log.warn("cloud-client服务不可用");
        return "cloud-client服务不可用";
    }
}
