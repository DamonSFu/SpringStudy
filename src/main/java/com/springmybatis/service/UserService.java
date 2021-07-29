package com.springmybatis.service;

import com.springmybatis.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
}
