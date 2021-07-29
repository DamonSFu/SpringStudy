package com.springdao.dao;

import com.springdao.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> findAll();

    void save(User user);
}
