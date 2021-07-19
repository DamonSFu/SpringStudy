package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTag {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("scope/spring.xml");

        // 关闭工厂
        ((ClassPathXmlApplicationContext)context).close();


        // 获取对象
//        TagDAO tagDAO = (TagDAO) context.getBean("tagDAO");
//        TagDAO tagDAO1 = (TagDAO) context.getBean("tagDAO");
//        System.out.println(tagDAO);
//        System.out.println(tagDAO1);
//        System.out.println(tagDAO == tagDAO1);


        // 工厂原理
//        TagDAO tt = (TagDAO) Class.forName("scope.TagDAOImpl").newInstance();
//        System.out.println(tt);
    }
}
