package com.oops.practice;

public class CreditCardPayment  implements Payment{
    private String cardNumber;
    public CreditCardPayment(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount)
    {
        System.out.println("Payment of "+amount+ "was deducted from "+cardNumber+" credit card\nThanks for Shopping with us");
    }

}
