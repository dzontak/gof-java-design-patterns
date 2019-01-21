package com.learn.patterns.creational.factorymethod;

import java.math.BigDecimal;

public class PhoneFactory extends ProductAbstractFactory {
    @Override
     Product makeProduct() {
        return new Phone("Iphone", new BigDecimal("500"));
    }
}
