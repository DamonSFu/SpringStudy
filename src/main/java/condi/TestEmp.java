package condi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.image.renderable.ContextualRenderedImageFactory;

public class TestEmp {
    public static void main(String[] args) {

        // 启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("condi/spring.xml");

        // 获取对象
//        EmpDAO empDAO = (EmpDAO) context.getBean("empDAO");
//        empDAO.save("empDAO");

        EmpService empService = (EmpService) context.getBean("empService");
        empService.save("empService");
    }
}
