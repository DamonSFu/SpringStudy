package com.springmybatis.service;

public class AServiceImpl implements AService{

    private BService bbbService;

    public void setBbbService(BService bbbService) {
        this.bbbService = bbbService;
    }

    @Override
    public void insert() {
        bbbService.update();
        System.out.println("AService Insert");
    }

    @Override
    public String find() {
        System.out.println("AService Find");
        return "AService find";
    }
}
