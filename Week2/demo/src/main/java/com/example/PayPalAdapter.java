package com.example;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public boolean processPayment(double amount) {
        return payPalGateway.sendPayment(amount);
    }
}
