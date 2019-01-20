package com.learn.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Catalog acts as a factory and flywight for Items
public class Catalog {

  private Map<String, Item> items = new HashMap<>();

  // factory method
  public Item lookup(String name) {
    if (!items.containsKey(name)) {
      items.put(name, new Item(name));
    }
    return items.get(name);
  }

  public int totalItemsMade() {
    return items.size();
  }
}
