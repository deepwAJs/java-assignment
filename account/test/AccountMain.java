package com.account.test;

import com.account.Account;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1, "Savings", 1000);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    double balance = account.getBalance();
                    System.out.println("Current Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

