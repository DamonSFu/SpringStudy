package staticproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
         // 启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("staticproxy/spring.xml");

//        UserService userService = (UserService) context.getBean("userService");
        // 写好代理后
        UserService userService = (UserService) context.getBean("userServiceStaticProxy");


        userService.findAll("查找全部");
    }
}
