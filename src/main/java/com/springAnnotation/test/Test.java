package com.springAnnotation.test;

import com.springAnnotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springAnnotation/spring.xml");
        UserService userService = (UserService) context.getBean("userService");
//        userService.save("ceshi");
        userService.findAll().forEach(user -> System.out.println("user = " + user));
    }
}
