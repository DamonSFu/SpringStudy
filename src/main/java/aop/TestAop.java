package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
         // 启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/spring.xml");
        // 获取对象
        EmpService empService = (EmpService) context.getBean("empService");
        System.out.println(empService.getClass());
        // 代理对象
        empService.find(" aop");
    }
}
