package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentAdapterTest {
    @Test
    public void testStripeAdapter() {
        PaymentProcessor processor = new StripeAdapter(new StripeGateway());
        assertTrue(processor.processPayment(500.0));
    }

    @Test
    public void testPayPalAdapter() {
        PaymentProcessor processor = new PayPalAdapter(new PayPalGateway());
        assertTrue(processor.processPayment(1500.0));
    }
}
