package com.learn.patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {
    public static void main(String[] args) {
        Integer [] arrayOfInts = {1,2,3};
        List<Integer> list = Arrays.asList(arrayOfInts); // adapter
        System.out.println(list);
        System.out.println(arrayOfInts);

    }

}
