package com.michaelcane;

import java.util.ArrayList;

public class Account {

    /**
     * Fields for a base account, additional information
     * provided sub-classes of different Account Types.
     */
    private long accountNumber = 0;
    private String accountName = "";
    private AccountStatuses status = AccountStatuses.OPEN;
    private OverDraftPrevention overdraft = OverDraftPrevention.ENABLED;
    private ArrayList<String> transactionHistory = new ArrayList<String>();
    private ArrayList<String> changeHistory = new ArrayList<String>();

    public void accountGenerator() {
        double number = Math.random();
        double newNumber = number * 1000000;
        this.accountNumber = (long)newNumber;
    }

    /**
     * Account constructor.
     * @param customerName
     */
    public Account (String customerName) {
        this.accountName = customerName;
        accountGenerator();
    }


}
