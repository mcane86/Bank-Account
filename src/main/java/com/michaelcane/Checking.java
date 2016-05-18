package com.michaelcane;

public class Checking extends Account {

    private final double interest = 0.0;
    private float balance = 0.0f;

    public Checking(String customerName) {
        super(customerName);
    }
}
