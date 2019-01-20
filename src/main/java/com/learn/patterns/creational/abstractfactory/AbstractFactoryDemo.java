package com.learn.patterns.creational.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getInstance(775);

        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getInstance(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());
    }
}
