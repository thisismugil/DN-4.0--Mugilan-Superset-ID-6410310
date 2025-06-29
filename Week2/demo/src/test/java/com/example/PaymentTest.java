package com.example;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());

        stripeProcessor.processPayment(200.0);
        paypalProcessor.processPayment(89.50);
    }
}
