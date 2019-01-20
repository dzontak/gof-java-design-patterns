package com.learn.patterns.behaivoral.strategy;

public class VisaStrategy extends ValidationStrategy {

  @Override
  boolean isValid(CreditCard card) {
    boolean isValid = false;
    String number = card.getNumber();
    isValid = number.startsWith("4") && number.length() == 16;
    if (isValid) {
      isValid = passesLuhn(card.getNumber());
    }
    return isValid;
  }
}
