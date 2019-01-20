package com.learn.patterns.behaivoral.Interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        String context = "lions bears";
        Expression<String> interpreter = buildInterpreterTree();
        System.out.println(context + " is " + interpreter.interpret(context));

    }

    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("lions");
        Expression terminal2 = new TerminalExpression("tigers");
        Expression terminal3 = new TerminalExpression("bears");
        // (tigers && bears)
        Expression<String> alternation1 = new AndExpression(terminal2, terminal3);
        // Lions || (tigers && bears)
        Expression<String> alternation2 = new OrExpression(terminal1, alternation1);

        return new AndExpression(terminal3, alternation2);

    }
}
