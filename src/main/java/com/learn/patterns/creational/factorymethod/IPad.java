package com.learn.patterns.creational.factorymethod;

import java.math.BigDecimal;

public class IPad implements Product {

  private String name;
  private BigDecimal price;

  public IPad(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public BigDecimal getPrice() {
    return this.price
            ;
  }
}
