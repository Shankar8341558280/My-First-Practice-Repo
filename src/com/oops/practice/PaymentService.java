package com.oops.practice;

public class PaymentService {

    private Payment paymentMethod;

    public PaymentService(Payment paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }

    public void makepayment(double amount)
    {
        paymentMethod.pay(amount);
    }

}
