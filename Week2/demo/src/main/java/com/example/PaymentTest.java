package com.example;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        stripe.processPayment(1000.0);

        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(2000.0);
    }
}
