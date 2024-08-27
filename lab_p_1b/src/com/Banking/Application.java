package com.Banking;

public class Application {
    public static void main(String[] args) {
        LoginManager loginManager = LoginManager.getInstance();

       
        BankAccount account = new BankAccount(1000.00);
        account.viewBalance();

       
        loginManager.login("john_doe");

       
        account.viewBalance();
        account.deposit(200.00);
        account.withdraw(150.00);

       
        loginManager.logout();

        
        account.viewBalance();
    }
}
