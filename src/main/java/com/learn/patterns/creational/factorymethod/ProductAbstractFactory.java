package com.learn.patterns.creational.factorymethod;

public abstract class ProductAbstractFactory {
  abstract Product makeProduct();

  public Product instance() {
    return this.makeProduct();
  }
}
