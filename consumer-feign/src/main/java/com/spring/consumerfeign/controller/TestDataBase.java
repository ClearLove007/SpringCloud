package com.spring.consumerfeign.controller;

import com.spring.consumerfeign.entity.User;
import com.spring.consumerfeign.service.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/consumer-fegin/test-data")
public class TestDataBase {

    @Autowired
    private TestDataService testDataService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        List<User> result = testDataService.findAll();
        for (User user:result) {
            System.out.println(user.toString());
        }
        return result;
    }
}
