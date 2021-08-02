package com.springAnnotation.dao;

import com.springAnnotation.entity.User;

import java.util.List;

public interface UserDAO {
    void save(String name);
    List<User> findAll();
}
