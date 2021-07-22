package com.adviceStudy.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Date;

// 自定义环绕通知，用来记录目标方法的执行时长
public class MethodInvokeTimeAdvice implements MethodInterceptor {

    // 参数：methodInvocation 获取当前执行方法 获取当前执行方法的参数 获取目标对象
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("============================进入环绕通知=============================");
        System.out.println("当前执行方法： " + methodInvocation.getMethod().getName());
        System.out.println("方法的参数： " + methodInvocation.getArguments()[0]);
        System.out.println("获取当前的目标对象： " + methodInvocation.getThis());
        try {
            long start = new Date().getTime();
            // 放行目标方法
            System.out.println("============================放行目标方法=============================");
            Object proceed = methodInvocation.proceed();
            long end = new Date().getTime();
            System.out.println(methodInvocation.getMethod().getName()+"方法本次执行了["+(end-start)+"]ms !");
            return proceed;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("环绕通知---出现异常时业务处理");
        }
        return null;
    }
}
