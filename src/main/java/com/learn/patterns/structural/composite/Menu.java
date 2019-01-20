package com.learn.patterns.structural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

    Menu(String name, String value) {
        super(name, value);
    }

    @Override
    public MenuComponent add(MenuComponent component) {
        menuComponents.add(component);
        return component;
    }
    @Override
    public MenuComponent remove(MenuComponent component) {
        menuComponents.remove(component);
        return component;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while(iterator.hasNext()) {
            builder.append(iterator.next().toString());
        }
        return builder.toString();
    }
}
