package com.spring.consumerconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerConfigApplication.class, args);
    }

}
