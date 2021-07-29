package com.springmybatis.dao;

import com.springmybatis.entity.User;

import java.util.List;

public interface UserDAO {
    void save(User user);
    List<User> findAll();
}
