package com.principal.solid;

public class CheckoutService {
    private final PaymentGateway paymentGateway;
    public CheckoutService(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
    }
    public void checkOut(double amount){
        paymentGateway.processPayment(amount);
    }
}
