package com.principal.solid;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Dependency Inversion Principal" );
        PaymentGateway gateway = new PayPalPaymentGateway();
        CheckoutService checkoutService = new CheckoutService(gateway);
        checkoutService.checkOut(125.90);
    }
}
