package com.soring.consumerfeign.feignClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    Logger log = LoggerFactory.getLogger(this.getClass());
    @Override
    public String helloName(String name) {
        log.warn("cloud-client服务不可用");
        return "cloud-client服务不可用";
    }
}
