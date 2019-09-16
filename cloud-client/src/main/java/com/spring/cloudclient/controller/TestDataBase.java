package com.spring.cloudclient.controller;

import com.spring.cloudclient.entity.User;
import com.spring.cloudclient.service.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/cloud-client/test-data")
public class TestDataBase {

    @Autowired
    private TestDataService testDataService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        return testDataService.findAll();
    }
}
