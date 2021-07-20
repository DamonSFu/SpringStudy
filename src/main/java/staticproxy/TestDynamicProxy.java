package staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDynamicProxy {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(); // 目标类
        System.out.println("userService class:   " + userService.getClass()); // userService class:   class staticproxy.UserServiceImpl
        // 使用动态代理对象：指的是在程序运行过程中动态通过代码的方式为指定的类生成动态代理对象
        // proxy：用来生成动态代理对象的类
        /**
         * 参数1：ClassLoader 类加载器
         * 参数2：Class[] 目标对象的接口类型的数组
         * 参数3：InvocationHandler接口类型 invoke方法，用来书写额外功能 附加操作
         * 返回值：创建好的动态代理对象
         */
        //参数1
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        //参数2
        Class[] classes = {UserService.class};
        System.out.println(classes); // [Ljava.lang.Class;@2503dbd3
//        Object o = Proxy.newProxyInstance(classLoader, classes, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserService userServiceDynamicProxy = (UserService) Proxy.newProxyInstance(classLoader, classes, new InvocationHandler() {
            /**
             * 通过动态代理对象自己里面代理方法时会优先指定InvocationHandler类中的invoke方法
             * @param proxy 当前创建好的代理对象
             * @param method 当前代理对象执行的方法对象
             * @param args 当前代理对象执行方法的参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("当前执行的方法：" + method.getName());
                // System.out.println("当前执行的方法" + method); // public abstract void staticproxy.UserService.save(java.lang.String)
                System.out.println("当前执行的方法的参数：" + args[0]);
                try {
                    System.out.println("开启事务");
                    // 调用目标类中业务方法，通过反射机制，调用目标类中当前方法
                    Object invoke = method.invoke(new UserServiceImpl(), args);
                    System.out.println("测试返回值：  "+invoke);
                    System.out.println("提交事务");
                    return invoke;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("回滚事务");
                }
                return null;
            }
        });
        System.out.println("userServiceDynamicProxy:   "+userServiceDynamicProxy.getClass());
        System.out.println("\n==================================================================\n");
        userServiceDynamicProxy.findAll("动态代理测试");// 通过动态代理对象调用代理中的方法

    }
}
