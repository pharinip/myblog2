package com.myblog.myblog2;

public class BankApp {

    public static void main(String[] args) {
        // Polymorphism in action
        BankAccount savingsAccount = new SavingsAccount(1000, 0.05);
        BankAccount checkingAccount = new CheckingAccount(1500, 500);

        // Method overriding based on the actual object type
        savingsAccount.deposit(200);  // Interest added: $210.0
        checkingAccount.withdraw(200); // Withdrawn: $200

        // Method overloading based on the reference type
        CheckingAccount myCheckingAccount = new CheckingAccount(2000, 1000);
        myCheckingAccount.deposit(300); // Deposited: $300
        myCheckingAccount.checkBalance(); // Current Balance: $2300
    }
}
