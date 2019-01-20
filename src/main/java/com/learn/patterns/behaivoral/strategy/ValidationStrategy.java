package com.learn.patterns.behaivoral.strategy;

public abstract class ValidationStrategy {

    abstract boolean isValid(CreditCard card);

    boolean passesLuhn(String ccNumber) {
        // use Luhn algorithm to verify a card number
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
