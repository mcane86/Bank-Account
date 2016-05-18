package com.michaelcane;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccountTest {

    Account account;
    @Before public void initializationSetup(){
        account = new Account("Michael Cane");
    }

    double delta = 1e-15;

    /**
     * When accountGenerator provided a Math.random() that was then Math.round()
     * it provided a 1.
     */
    @Test
    public void accountGeneratorTest() {
        double expectedValue = 1;
        double actualValue = account.accountGenerator();
        assertEquals("Should print out a number", expectedValue, actualValue, delta);
    }
}
