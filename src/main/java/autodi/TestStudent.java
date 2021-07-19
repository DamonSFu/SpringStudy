package autodi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        // 启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("autodi/spring.xml");

        // 获取对象
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.save("Student");
    }
}
