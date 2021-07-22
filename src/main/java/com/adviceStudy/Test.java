package com.adviceStudy;

import com.adviceStudy.service.DeptService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // 启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("com/adviceStudy/spring.xml");
        // 获取对象
        DeptService deptService = (DeptService) context.getBean("deptService");

        System.out.println(deptService.getClass());
        deptService.find("XXX");
    }
}
