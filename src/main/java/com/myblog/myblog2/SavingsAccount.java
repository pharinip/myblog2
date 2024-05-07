package com.myblog.myblog2;

public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    // Method overriding and additional behavior
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        balance += amount * interestRate; // Add interest for savings account
    }
}
