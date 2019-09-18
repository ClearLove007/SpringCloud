package com.spring.consumerfeign.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 指定调用的服务名，以及hystrix需要的回调函数
 */
@FeignClient(value = "cloud-client", fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping("/cloud/client/hello")
    public String helloName(@RequestParam("name") String name);

    @RequestMapping("/cloud-client/test-data/findAll")
    public List clientCallback();
}
