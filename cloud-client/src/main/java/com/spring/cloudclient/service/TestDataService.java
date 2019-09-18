package com.spring.cloudclient.service;

import com.spring.cloudclient.entity.User;
import com.spring.cloudclient.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestDataService {

    @Resource
    private UserMapper userMapper;

    public List<User> findAll(){
        List<User> result = userMapper.findAll();
        for (User user:result) {
            System.out.println(user.toString());
        }
        return result;
    }
}
