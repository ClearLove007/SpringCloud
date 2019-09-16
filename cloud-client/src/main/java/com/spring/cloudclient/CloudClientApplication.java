package com.spring.cloudclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.spring.cloudclient.mapper")
public class CloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }

}
