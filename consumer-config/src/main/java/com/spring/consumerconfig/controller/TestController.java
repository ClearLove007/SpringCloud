package com.spring.consumerconfig.controller;

import com.spring.consumerconfig.controller.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

//    @Autowired
//    private UserInfo value;

    @Value("${userinfo.username}")
    private String value;

    @RequestMapping("value")
    public String getValue(){
        return value;
    }
}
