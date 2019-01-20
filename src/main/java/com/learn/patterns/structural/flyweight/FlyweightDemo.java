package com.learn.patterns.structural.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();
        ims.takeOrder("Iphone", 232);
        ims.takeOrder("Effective Java", 442);
        ims.takeOrder("Headfirst Design Patters", 124);
        ims.takeOrder("Macbook pro 2018", 567);
        ims.takeOrder("Iphone", 333);
        ims.takeOrder("Effective Java", 4);
        ims.takeOrder("Effective Java", 55);
        ims.takeOrder("Effective Java", 66);
        ims.takeOrder("Effective Java", 777);
        ims.takeOrder("Effective Java", 856);


        ims.process();
        System.out.println(ims.report());
    }
}
