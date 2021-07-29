package com.springdao.test;

import com.springdao.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 在spring.xml中加入
 * <!-- 创建DAO组件类 --> 后
 * 可按如下调用
 */
public class TestUserDAO {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springdao/spring.xml");
        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        userDAO.findAll().forEach(user -> System.out.println(user));
    }
}
