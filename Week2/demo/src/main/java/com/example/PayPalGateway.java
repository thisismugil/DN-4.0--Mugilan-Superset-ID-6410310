package com.example;

public class PayPalGateway {
    public boolean sendPayment(double amount) {
        System.out.println("PayPalGateway: Sending payment of ₹" + amount);
        return true;
    }
}
