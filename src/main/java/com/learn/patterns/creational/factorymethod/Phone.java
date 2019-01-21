package com.learn.patterns.creational.factorymethod;

import java.math.BigDecimal;

public class Phone implements Product {

    private String name;
    private BigDecimal price;

    public Phone(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }
}
