package com.learn.patterns.behaivoral.templatemethod;

public abstract class OrderTemplate {

  public boolean isGift;

  public abstract void doCheckout();

  public abstract void doPayment();

  public abstract void doReciept();

  protected abstract void doDelivery();

  public final void wrapGift() {
    System.out.println("Gift was wrapped");
  }

  public final void processOrder() {

    doCheckout();
    doPayment();
    if (isGift) {
      wrapGift();
    } else {
      doReciept();
    }
    doDelivery();
  }
}
