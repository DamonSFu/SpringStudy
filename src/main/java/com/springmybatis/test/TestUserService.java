package com.springmybatis.test;


import com.springmybatis.entity.User;
import com.springmybatis.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestUserService {

    private ApplicationContext context;

    @Before
    public void before(){
        this.context = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void testFindAll(){
        UserService userService = (UserService) context.getBean("userService");
        userService.findAll().forEach(user -> System.out.println("user = " + user));
    }

    @Test
    public void testSave(){
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setAge(99);
        user.setBir(new Date());
        user.setName("布吉岛");
        userService.save(user);

    }

//    @After
//    public void after(){
////        context.close();
//        testFindAll();
//    }
}
