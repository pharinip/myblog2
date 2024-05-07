package com.myblog.myblog2;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding and additional behavior
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }
}
