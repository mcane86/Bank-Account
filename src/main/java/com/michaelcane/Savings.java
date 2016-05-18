package com.michaelcane;

public class Savings extends Account {

    private final double interest = 0.06;
    private float balance = 0.0f;

    public Savings(String customerName){
        super(customerName);
    }
}
