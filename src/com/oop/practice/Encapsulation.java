package com.oop.practice;

import java.util.Scanner;

public class Encapsulation {

    private int balance;

    public void depositAmount(int amount)
    {
        if(amount <= 0)
        {
            System.out.println("Amount should be greater than zero to deposit");
            return;
        }
        balance += amount;
        System.out.println("Amount successfully deposited into your account \n Available Balance : "+balance+"\n Thanks for banking with us Visit Again!!");
    }

    public void withdrawAmount(int amount)
    {
        if(amount <= 0 || amount > balance)
        {
            System.out.println("Unable to process your transaction.. Please Try Again!!");
            return;
        }
        balance -= amount;
        System.out.println("Please collect your Money.\nDo you want to show your available balance.\nYes - 1 or No - 0");

        Scanner sc = new Scanner(System.in);
        int choice  = sc.nextInt();

        switch (choice)
        {
            case 1 : System.out.println("Available Balance : "+balance);
            case 0 : System.out.println("Thanks for banking with us Visit Again!!");
            break;
            default:System.out.println("Sorry you entered an invalid option\nThanks for banking with us Visit Again!!");
        }

    }

    public void getBalance()
    {
        System.out.println("Available Balance : "+balance+"\nThanks for banking with us Visit Again!!");
    }
}
