package com.learn.patterns.behaivoral.strategy;

public class AmexStrategy extends ValidationStrategy {
  @Override
  boolean isValid(CreditCard card) {
    boolean isValid = false;
    String number = card.getNumber();
    // starts with 34 or 37
    isValid = number.startsWith("37") || number.startsWith("34");
    // has length 15
    isValid = number.length() == 15;
    if (isValid) {
      isValid = passesLuhn(card.getNumber());
    }
    return isValid;
  }
}
