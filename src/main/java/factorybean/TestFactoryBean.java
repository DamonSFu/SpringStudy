package factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;

public class TestFactoryBean {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        // 日历类
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
//
//        // Connection
//        Class.forName("driver");
//        Connection conn = DriverManager.getConnection("url","username","password");
//        System.out.println(conn);

        ApplicationContext context = new ClassPathXmlApplicationContext("factorybean/spring.xml");
        Calendar calendar = (Calendar) context.getBean("calendar");
        Calendar calendar1 = (Calendar) context.getBean("calendar");
        System.out.println(calendar == calendar1);
        System.out.println(calendar.getTime());

        Connection connection = (Connection) context.getBean("conn");
        System.out.println(connection);

    }
}
