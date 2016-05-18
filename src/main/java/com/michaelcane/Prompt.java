package com.michaelcane;

import java.util.Scanner;

public class Prompt {

    Scanner input = new Scanner(System.in);

    public int promptUserForInteger(String msg) {
        promptUser(msg);
        return input.nextInt();
    }

    public void promptUser(String msg) {
        System.out.println(msg);
    }
}
