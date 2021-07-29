package com.springdao.test;

import com.springdao.entity.User;
import com.springdao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestUserService {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springdao/spring.xml");
        UserService userService = (UserService) context.getBean("userService");

        System.out.println(userService.getClass());
        //save
        userService.save(new User(null,"service",23,new Date()));
        //findAll
        userService.findAll().forEach(user -> System.out.println(user));
    }
}
