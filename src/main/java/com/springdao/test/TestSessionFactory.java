package com.springdao.test;

import com.springdao.dao.UserDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSessionFactory {
    public static void main(String[] args) {

        // 启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springdao/spring.xml");

        // 获取数据
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");

        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);

        UserDAO userDAO = sqlSession.getMapper(UserDAO.class);
        userDAO.findAll().forEach(user -> System.out.println(user));
    }
}
