package com.michaelcane;

public class Investment extends Account {

    private final double interest = 0.1;
    private float balance = 0.0f;

    public Investment(String customerName) {
        super(customerName);
    }
}
