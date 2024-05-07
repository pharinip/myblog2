package com.myblog.myblog2;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class B {

    public static void main(String[] args) {

//        List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        List<Integer> even = values.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(even);


        int[] prime = {1, 2, 3, 4, 5, 6, 7};

        for (int x : prime) {
            int count = 0; // Reset count for each number
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("The given number is prime: " + x);
            } else {
                System.out.println("The given number is not prime: " + x);
            }

        }
    }
}
