package com.spring.consumerfeign.config;

import feign.Contract;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Contract feiginContract(){
        return new feign.Contract.Default();
    }

    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default();
    }
}
