package com.oops.practice;

public class PaypalPayment implements Payment{

    private String acctNo;

    public PaypalPayment(String acctNo)
    {
        this.acctNo = acctNo;
    }

    public void pay(double amount)
    {
        System.out.println("Payment of "+amount+ "was deducted from "+acctNo+" Paypal Account \nThanks for Shopping with us");
    }

}
