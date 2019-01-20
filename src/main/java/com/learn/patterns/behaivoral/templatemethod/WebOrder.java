package com.learn.patterns.behaivoral.templatemethod;

public class WebOrder extends OrderTemplate {
  @Override
  public void doCheckout() {
    System.out.println("WebOrder Checkout");
  }

  @Override
  public void doPayment() {
      System.out.println("WebOrder Payment");

  }

  @Override
  public void doReciept() {
      System.out.println("WebOrder Reciept");

  }

  @Override
  protected void doDelivery() {
      System.out.println("WebOrder Delivery");

  }
}
