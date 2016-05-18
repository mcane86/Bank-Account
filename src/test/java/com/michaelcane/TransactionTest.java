package com.michaelcane;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionTest {

    Transaction transaction;
    @Before public void initializationSetup() {
        transaction = new Transaction(1, 7, 2, 0, 5, 452, 0);
    }

    @Test
    public void testTransactionBuilder() {
        String expectedValue = "1, 7.50, 2, 0, 5/3/16 5:11, 452, 0";
        String actualValue = transaction.transactionBuilder();
        assertEquals("Should provide the transactin data", expectedValue, actualValue);
    }
}
