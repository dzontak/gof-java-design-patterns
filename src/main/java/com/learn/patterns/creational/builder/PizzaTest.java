package com.learn.patterns.creational.builder;

import static com.learn.patterns.creational.builder.Pizza.Topping.*;
import static com.learn.patterns.creational.builder.NyPizza.Size.*;
import static com.learn.patterns.creational.builder.ChicagoPizza.Crust.*;

// Using the hierarchical builder (Page 16)
public class PizzaTest {
  public static void main(String[] args) {
    NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
    Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
    ChicagoPizza chicago =
        new ChicagoPizza.Builder(THICK)
            .addTopping(HAM)
            .addTopping(ONION)
            .addTopping(MUSHROOM)
            .build();

    System.out.println(pizza);
    System.out.println(calzone);
    System.out.println(chicago);
  }
}
