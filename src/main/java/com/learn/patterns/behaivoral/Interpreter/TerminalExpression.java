package com.learn.patterns.behaivoral.Interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression<String> {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String data) {

        StringTokenizer st = new StringTokenizer(data);
        while(st.hasMoreElements()) {
            String test = st.nextToken();
             if(test.equals(data)) {
                 return true;
             }
        }
        return false;
    }
}
