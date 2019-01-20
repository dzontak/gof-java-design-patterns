package com.learn.patterns.behaivoral.Interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {
    public static void main(final String[] args) {
        String input = "Lions, and tigers, and bears! Oh, my!";
        Pattern pattern = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger)",
        Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(input);
        while(m.find()) {
            System.out.println("Found a " + m.group());
        }
    }
}
