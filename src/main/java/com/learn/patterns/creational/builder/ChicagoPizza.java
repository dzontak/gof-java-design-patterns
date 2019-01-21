package com.learn.patterns.creational.builder;

import java.util.Objects;

public class ChicagoPizza extends Pizza {
  public enum Crust {
    THIN,
    THICK
  }

  private final Crust crust;

  public static class Builder extends Pizza.Builder<Builder> {
    private final Crust crust;

    public Builder(Crust crust) {
      this.crust = Objects.requireNonNull(crust);
    }

    @Override
    ChicagoPizza build() {
      return new ChicagoPizza(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

  private ChicagoPizza(Builder builder) {
    super(builder);
    this.crust = builder.crust;
  }

  @Override
  public String toString() {
    return String.format("Chicago %s crust Pizza with %s", crust, toppings);
  }
}
