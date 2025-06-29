package com.example;

public class StripeGateway {
    public boolean makePayment(double amount) {
        System.out.println("StripeGateway: Processing payment of ₹" + amount);
        return true;
    }
}
