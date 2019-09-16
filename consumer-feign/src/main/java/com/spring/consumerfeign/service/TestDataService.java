package com.spring.consumerfeign.service;

import com.spring.consumerfeign.entity.User;
import com.spring.consumerfeign.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestDataService {

    @Resource
    private UserMapper userMapper;

    public User findById(String id){
        return userMapper.findById(id);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }
}
