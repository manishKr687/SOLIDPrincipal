package com.principal.solid;

public class StripPaymentGateway implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Stripe Payment in Progress...");
    }
}
