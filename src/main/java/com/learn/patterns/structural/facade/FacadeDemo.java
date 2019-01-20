package com.learn.patterns.structural.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        JdbcFacade facade = new JdbcFacade();
        System.out.println(facade.getAddresses());
    }
}
