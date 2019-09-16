package com.spring.cloudclient.mapper;


import com.spring.cloudclient.entity.User;

import java.util.List;

public interface UserMapper {

    public User findById(String id);

    public List<User> findAll();
}
