package com.learn.patterns.structural.bridge;

public abstract class Shape {
  Color color;

  public Shape(Color color) {
    this.color = color;
  }

  abstract void applyColor();
}
