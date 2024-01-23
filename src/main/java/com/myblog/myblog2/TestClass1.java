package com.myblog.myblog2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass1 {

    public static void main(String[] args) {

        List<Transaction> data= Arrays.asList(
                new Transaction(100,"USD"),
                new Transaction(50,"EUR"),
                new Transaction(90,"USD"),
                new Transaction(60,"Rs"),
                new Transaction(80,"USD")
        );
  //Find total sum of transactions for currency USD

        String currency="USD";

  List<Transaction> val=data.stream().filter(trans->trans.getCurrency().equals(currency)).collect(Collectors.toList());
        List<Integer> intval=val.stream().map(i->i.getTransaction()).collect(Collectors.toList());
        int finalVal=intval.stream().reduce(0,Integer::sum);
        System.out.println("The sum of USD Transactions are "+ finalVal);
    }
}
