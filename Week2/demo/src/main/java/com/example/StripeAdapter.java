package com.example;

public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public boolean processPayment(double amount) {
        return stripeGateway.makePayment(amount);
    }
}
