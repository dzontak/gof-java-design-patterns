package com.learn.patterns.behaivoral.interator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList(Arrays.asList("Joe", "Frank", "Maria", "Libby"));

        for(String name: list) {
            System.out.println(name);
        }


        Iterator<String> iterator = list.iterator();


        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("size: " + list.size());

    }
}
