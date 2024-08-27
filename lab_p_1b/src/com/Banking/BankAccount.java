package com.Banking;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to view balance
    public void viewBalance() {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    
    public void withdraw(double amount) {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
