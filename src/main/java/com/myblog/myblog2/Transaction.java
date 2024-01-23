package com.myblog.myblog2;

public class Transaction {

    private int transaction;
    private String currency;

    public Transaction(int transaction, String currency) {
        this.transaction = transaction;
        this.currency = currency;
    }

    public int getTransaction() {
        return transaction;
    }

    public String getCurrency() {
        return currency;
    }
}
