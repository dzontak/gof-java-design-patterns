package com.learn.patterns.structural.bridge;

public class BridgeDemo {
    public static void main(String args[]) {
        Color blue = new Blue();
        Shape square = new Square(blue);
        Color red = new Red();
        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();

        Shape greenCircle  = new Circle(new Green());
        greenCircle.applyColor();

    }
}
