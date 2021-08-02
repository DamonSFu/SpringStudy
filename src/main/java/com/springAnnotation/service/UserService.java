package com.springAnnotation.service;

import com.springAnnotation.entity.User;

import java.util.List;

public interface UserService {
    void save(String name);
    List<User> findAll();
}
