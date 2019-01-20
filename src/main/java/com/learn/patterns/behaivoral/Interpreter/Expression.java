package com.learn.patterns.behaivoral.Interpreter;

public interface Expression<T> {

    boolean interpret(T context);
}
