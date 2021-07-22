package com.adviceStudy.dao;

public class DeptDAOImpl implements DeptDAO{
    @Override
    public void save(String name) {
        System.out.println("save DAO " + name);
    }

    @Override
    public String find(String name) {
        System.out.println("find DAO " + name);
        return name;
    }
}
