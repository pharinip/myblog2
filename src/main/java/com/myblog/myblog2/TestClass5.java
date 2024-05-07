package com.myblog.myblog2;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestClass5 {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9);

        Stream<Integer> lazyStream = nums.stream().filter(n -> n % 2 == 0).map(i -> {
            System.out.println("map....");
            return i;
        });
        System.out.println("Calling collect methos");


        lazyStream.collect(Collectors.toList());
    }
}
