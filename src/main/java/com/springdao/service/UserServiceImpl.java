package com.springdao.service;

import com.springdao.dao.UserDAO;
import com.springdao.entity.User;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.List;
import java.util.UUID;

public class UserServiceImpl implements UserService{
    private UserDAO userDAO;
    //声明事务管理器
//    private PlatformTransactionManager platformTransactionManager;
//
//    public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
//        this.platformTransactionManager = platformTransactionManager;
//    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void save(User user) {
        //创建事务配置对象
//        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
//        //获取事务状态
//        TransactionStatus transaction = platformTransactionManager.getTransaction(transactionDefinition);
//        try {
            //处理业务
            user.setId(UUID.randomUUID().toString());
            //调用业务
            userDAO.save(user); // spring为了方便执行，在DAO层方法上做了一个小事务，方便测试DAO。当外部存在事务时，小事务自动失效
//            int i = 1/0;
//            platformTransactionManager.commit(transaction);
//        } catch (Exception e) {
//            e.printStackTrace();
//            platformTransactionManager.rollback(transaction);
//        }

    }
}
