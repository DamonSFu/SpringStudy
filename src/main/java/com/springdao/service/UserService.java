package com.springdao.service;

import com.springdao.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
}
