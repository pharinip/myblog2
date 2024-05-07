package com.myblog.myblog2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class C {

    public static void main(String[] args) {

        Stream.iterate(2,n->n+2).limit(10).forEach(System.out::println);


    }
}
