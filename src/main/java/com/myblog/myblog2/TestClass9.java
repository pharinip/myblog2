package com.myblog.myblog2;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestClass9 {

    public static void main(String[] args) {

        Stream.Builder<String> str=Stream.builder();

        str.add("Hi");
        str.add("Hello");

        Stream<String> build = str.build();

        build.forEach(System.out::println);

        List<Integer> collect = Stream.iterate(2, n -> n + 2).limit(5).collect(Collectors.toList());
        System.out.println(collect);
    }
}
