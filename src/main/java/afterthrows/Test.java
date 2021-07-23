package afterthrows;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        // 启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("afterthrows/spring.xml");
        // 获取对象
        AfterThrowsService afterThrowsService = (AfterThrowsService) context.getBean("afterThrowsService");

        System.out.println(afterThrowsService.getClass());
        afterThrowsService.save("XXX");
        afterThrowsService.find("XXXfind");


    }
}
