package com.springdao.adviceSpringdao;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class MethodInvokeAdvice implements MethodInterceptor {
    private PlatformTransactionManager platformTransactionManager;

    public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
        this.platformTransactionManager = platformTransactionManager;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("=======================进入环绕通知======================");
        System.out.println(invocation.getMethod().getName());
//        System.out.println(invocation.getArguments()[0]);
        System.out.println(invocation.getThis());

        //创建事务配置对象
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        //获取事务状态
        TransactionStatus transaction = platformTransactionManager.getTransaction(transactionDefinition);
        try {
            Object proceed = invocation.proceed();
            System.out.println("OK");
            platformTransactionManager.commit(transaction);
            return proceed;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("进入catch");
            platformTransactionManager.rollback(transaction);
        }
        return null;
    }
}

