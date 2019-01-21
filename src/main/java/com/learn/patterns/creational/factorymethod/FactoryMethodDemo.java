package com.learn.patterns.creational.factorymethod;

public class FactoryMethodDemo {

  public static void main(String[] args) {
    Product product = new PhoneFactory().instance();
    System.out.println(product);

    product = new TabletFactory().instance();
    System.out.println(product);
  }
}
