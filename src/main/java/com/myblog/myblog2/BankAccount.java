package com.myblog.myblog2;

public class BankAccount {

    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method for deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method for withdrawal
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method for checking balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}
