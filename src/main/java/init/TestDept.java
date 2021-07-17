package init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDept {
    public static void main(String[] args) {

        // 启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("init/spring.xml");

        // 获取对象
        /**
         * 当加入业务层（Service）后，可直接调用业务层，此处可以不用再调用
         *
         * DeptDAO deptDAO = (DeptDAO) context.getBean("deptDAO");
         * deptDAO.save("测试一");
         */
        DeptService deptService = (DeptService) context.getBean("deptService");
        deptService.save("测试");


    }
}
