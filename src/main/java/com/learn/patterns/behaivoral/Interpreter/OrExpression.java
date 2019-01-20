package com.learn.patterns.behaivoral.Interpreter;

public class OrExpression implements Expression<String> {

  private Expression<String> exp1 = null;
  private Expression<String> exp2 = null;

  public OrExpression(Expression<String> exp1, Expression<String> exp2) {
    this.exp1 = exp1;
    this.exp2 = exp2;
  }

  @Override
  public boolean interpret(String context) {
    return exp1.interpret(context) || exp2.interpret(context);
  }
}
