package init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDept {
    public static void main(String[] args) {

        // 启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("init/spring.xml");

        // 获取对象
        DeptDAO deptDAO = (DeptDAO) context.getBean("deptDAO");

        deptDAO.save("测试一");
    }
}
