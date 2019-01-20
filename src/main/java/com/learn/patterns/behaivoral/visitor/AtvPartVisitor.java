package com.learn.patterns.behaivoral.visitor;

public interface AtvPartVisitor {
    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(Oil oil);
    void visit(PartsOrder order);

}
