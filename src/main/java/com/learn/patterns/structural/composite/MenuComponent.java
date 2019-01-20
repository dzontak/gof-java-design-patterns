package com.learn.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

  List<MenuComponent> menuComponents = new ArrayList<>();
  String name;
  String url;

  MenuComponent(String name, String url) {
    this.name = name;
    this.url = url;
  }

  public MenuComponent add(MenuComponent component) {
    throw new UnsupportedOperationException("Feature not implemented at this level");
  }

  public MenuComponent remove(MenuComponent component) {
      throw new UnsupportedOperationException("Feature not implemented at this level");
  }

  public String getName() {
    return name;
  }

  public String getUrl() {
    return url;
  }

  public abstract String toString();

  public String print(MenuComponent component) {
    StringBuilder builder = new StringBuilder();
    builder.append(component.getName());
    builder.append(": ");
    builder.append(component.getUrl());
    builder.append("\n");
    return builder.toString();
  }
}
