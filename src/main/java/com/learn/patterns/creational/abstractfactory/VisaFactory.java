package com.learn.patterns.creational.abstractfactory;

public class VisaFactory extends CreditCardFactory {

  @Override
  public CreditCard getCreditCard(final CardType cardType) {
    switch (cardType) {
      case GOLD:
        {
          return new VisaGoldCard();
        }
      case PLATINUM:
        {
          return new VisaPlatinumCard();
        }
      default:
        {
          return null;
        }
    }
  }

  @Override
  public Validator getValidator(CardType type) {

      switch (type) {
        case GOLD: {
          return new VisaGoldValidator();
        }
        case PLATINUM: {
          return new VisaPlatinumValidator();
        }
        default: {
          break;
        }
      }
      return null;

  }
}
