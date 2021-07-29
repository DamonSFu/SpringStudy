package com.springmybatis.service;

public class AServiceImpl implements AService{
    @Override
    public void save() {
        System.out.println("AService Save");
    }

    @Override
    public String find() {
        System.out.println("AService Find");
        return "AService find";
    }
}
