package com.myblog.myblog2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5);

        Stream<Integer> stream1=list.stream();

    }
}
