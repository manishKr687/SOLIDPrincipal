package com.principal.solid;

public class PayPalPaymentGateway implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("PayPal Payment in Progress...");
    }
}
