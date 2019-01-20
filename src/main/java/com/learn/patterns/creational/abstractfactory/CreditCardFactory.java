package com.learn.patterns.creational.abstractfactory;

/** Abstract CreditCard factory */
public abstract class CreditCardFactory {
  public static CreditCardFactory getInstance(final int creditScore) {
    if (creditScore > 650) {
      return new AmexFactory();
    } else {
      return new VisaFactory();
    }
  }

  public abstract CreditCard getCreditCard(CardType cardType);

  public abstract Validator getValidator(CardType type);
}
