package com.learn.patterns.behaivoral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder {
  List<AtvPart> order = new ArrayList<>();

  public void addPart(AtvPart part) {
    order.add(part);

  }

    public void accept(AtvPartVisitor visitor) {
        for(AtvPart part: order) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(order);
    }
}
