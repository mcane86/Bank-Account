package com.michaelcane;

public class ATM {

    Prompt prompt = new Prompt();

    public void engine(){
        boolean working = true;
        while (working) {
            int choice = prompt.promptUserForInteger("How can I help you? \n1.) Deposit 2.) Withdraw 3.) Transfer\n 4.) Open new Account 5.) Close Account 6.) Print Transaction History 7.) Check Balance");
            switch(choice) {

            }
        }
    }
}
