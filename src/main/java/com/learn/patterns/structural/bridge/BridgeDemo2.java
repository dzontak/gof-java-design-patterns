package com.learn.patterns.structural.bridge;

public class BridgeDemo2 {

    public static void main(String arg[]) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Printer moviePrinter = new MoviePrinter(movie);
        System.out.println(moviePrinter.print(new PrintFormatter()));
        System.out.println(moviePrinter.print(new HtmlFormatter()));
    }
 }
