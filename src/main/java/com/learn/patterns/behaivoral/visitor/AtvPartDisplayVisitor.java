package com.learn.patterns.behaivoral.visitor;

public class AtvPartDisplayVisitor implements AtvPartVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have a wheel");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("We have a fender");

    }

    @Override
    public void visit(Oil oil) {
        System.out.println("We have a oil");

    }

    @Override
    public void visit(PartsOrder order) {
        System.out.println("We have an order");
    }
}
