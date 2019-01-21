package com.learn.patterns.creational.factorymethod;

import java.math.BigDecimal;

public class TabletFactory extends ProductAbstractFactory {
  @Override
  Product makeProduct() {
    return new IPad("Ipad", new BigDecimal("400"));
  }
}
