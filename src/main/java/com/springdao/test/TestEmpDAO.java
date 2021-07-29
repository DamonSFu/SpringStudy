package com.springdao.test;

import com.springdao.dao.EmpDAO;
import com.springdao.dao.UserDAO;
import com.springdao.entity.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 在spring.xml中加入
 * <!-- 创建DAO组件类 --> 后
 * 可按如下调用
 */
public class TestEmpDAO {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springdao/spring.xml");
        EmpDAO empDAO = (EmpDAO) context.getBean("empDAO");
        empDAO.findAll().forEach(emp -> System.out.println("emp = " + emp));
    }
}
