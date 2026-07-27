import java.util.*;

public class BankingSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        int balance = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Banking System");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    balance = deposits(balance);
                    System.out.println("New Balance: " + balance);
                    System.out.println("**********************");
                    break;
                case 2:
                    balance = withdraw(balance);
                    System.out.println("New Balance: " + balance);
                    System.out.println("**********************");
                    break;
                case 3:
                    System.out.println("Current Balance: " + balance);
                    System.out.println("**********************");
                    break;
                case 4:
                    System.out.println("Program Exited Successfully");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid Selection");
                    break;
            }

        }
    }

    // deposits
    static int deposits(int balance) {
        System.out.println("Enter amount to be deposited");
        int amount = sc.nextInt();
        return balance + amount;
    }

    // withdrawals
    static int withdraw(int balance) {
        System.out.println("Enter amount to be withdrawn");
        int amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return balance;
        } else {
            return balance - amount;
        }
    }
    // balance inquiry
    // Exit

    // methods
}
