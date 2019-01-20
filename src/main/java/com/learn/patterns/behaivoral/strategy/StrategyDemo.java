package com.learn.patterns.behaivoral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {

        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("371449635398431");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println(amexCard);
        System.out.println("is valid " + amexCard.isValid());
        // make invalid
        amexCard.setNumber("371449639398431");
        System.out.println(amexCard);
        System.out.println("Is valid: " + amexCard.isValid());

        CreditCard visa = new CreditCard(new VisaStrategy());
        visa.setNumber("4111111111111111");
        visa.setDate("04/2020");
        visa.setCvv("123");
        System.out.println(visa);
        System.out.println("is valid " + visa.isValid());

    }
}
