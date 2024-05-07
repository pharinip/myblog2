package com.myblog.myblog2;


import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Create stream using Stream.of()
public class TestClass8 {

    public static void main(String[] args) {

        String[] str={"a","b","c","d"};

        getStream(str);
    }

    public static<T> void getStream(T[] arr){
        Stream<T> stream= Stream.of(arr);

        Iterator<T> iterator = stream.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

// create a empty stream using Stream.empty()

        Stream<String> str=Stream.empty();
//      System.out.println(str.collect(Collectors.toList()));
        long count = str.count();
        System.out.println(count);

        Integer k;



    }
 }
