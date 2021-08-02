package com.springAnnotation.service;

import com.springAnnotation.dao.UserDAO;
import com.springAnnotation.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

//    public void setUserDAO(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }

    @Override
    public void save(String name) {
        System.out.println("Service Name = " + name);
        userDAO.save(name);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
