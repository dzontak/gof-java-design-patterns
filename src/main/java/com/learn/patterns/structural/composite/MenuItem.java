package com.learn.patterns.structural.composite;

public class MenuItem extends MenuComponent {
    MenuItem(String name, String value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return print(this);
    }
}
