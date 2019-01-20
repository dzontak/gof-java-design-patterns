package com.learn.patterns.behaivoral.visitor;

import java.util.List;

public class AtvPartShippingVisitor implements AtvPartVisitor {

  double shoppingAmount = 0;

  @Override
  public void visit(Wheel wheel) {
    shoppingAmount += 15;
  }

  @Override
  public void visit(Fender fender) {
    shoppingAmount += 3;
  }

  @Override
  public void visit(Oil oil) {
    shoppingAmount += 5;
  }

  @Override
  public void visit(PartsOrder order) {
    List<AtvPart> parts = order.getParts();
    if (parts.size() > 3) {
      shoppingAmount -= 5;
    }
    System.out.println("Shipping amount is " + shoppingAmount);
  }
}
