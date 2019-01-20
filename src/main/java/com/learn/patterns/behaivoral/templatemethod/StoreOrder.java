package com.learn.patterns.behaivoral.templatemethod;

public class StoreOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Checkout items");
    }

    @Override
    public void doPayment() {
        System.out.println("Accept payment from customer");

    }

    @Override
    public void doReciept() {
        System.out.println("Give customer a reciept");

    }

    @Override
    protected void doDelivery() {
        System.out.println("Put items in cart");

    }
}
