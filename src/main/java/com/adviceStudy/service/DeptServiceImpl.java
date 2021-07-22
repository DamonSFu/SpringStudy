package com.adviceStudy.service;

import com.adviceStudy.dao.DeptDAO;

// 业务层组件
public class DeptServiceImpl implements DeptService{

    // 需要DAO组件
    private DeptDAO deptDAO;

    public void setDeptDAO(DeptDAO deptDAO) {
        this.deptDAO = deptDAO;
    }

    @Override
    public void save(String name) {
        System.out.println("处理save业务逻辑");
        deptDAO.save(name);
    }

    @Override
    public String find(String name) {
        System.out.println("处理find业务逻辑");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 模拟测试出错
        throw new RuntimeException("模拟抛出异常");
//        return deptDAO.find(name);
    }
}
