package com.sakshamkatiyar.atmmachine;

import java.util.Scanner;

class ATM {
    double balance;
    int PIN = 5678;
    Scanner sc = new Scanner(System.in);

    public void checkPIN() {
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Enter Your PIN: ");
            int pin = sc.nextInt();

            if (PIN == pin) {
                menu();
                return;
            } else {
                attempts--;
                System.out.println("Invalid PIN. Attempts left: " + attempts);
            }
        }
        System.out.println("Too many failed attempts. Card blocked.");
    }

    private void menu() {
        while (true) {
            System.out.println();
            System.out.println("--------------------------");
            System.out.println("Please choose and option");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. EXIT");
            System.out.println("===========================");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositAmount();
                    break;
                case 3:
                    withdrawAmount();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    return;
                default:
                    System.out.println("Invalid Option. Try again.");
            }
        }
    }

    private void withdrawAmount() {
        System.out.println("Enter Amount to be withdrawn:");

        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Enter a valid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Updated Balance: " + balance);
        }
    }

    private void depositAmount() {
        System.out.println("Enter Amount to be deposited:");

        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Entered amount must be more than 0");
        } else {
            balance += amount;
            System.out.println("Amount Deposited Successfully");
            System.out.println("Current Balance " + balance);
        }
    }

    private void checkBalance() {
        System.out.println("Balance: " + balance);
    }


}

public class Main {
    public static void main(String[] args) {
        ATM user = new ATM();
        user.checkPIN();
        user.sc.close();
    }
}