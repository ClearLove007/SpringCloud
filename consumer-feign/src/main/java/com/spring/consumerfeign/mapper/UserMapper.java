package com.spring.consumerfeign.mapper;

import com.spring.consumerfeign.entity.User;

import java.util.List;

public interface UserMapper {
    public User findById(String id);

    public List<User> findAll();
}
