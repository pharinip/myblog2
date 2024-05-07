package com.myblog.myblog2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class TestClass7 {

    public static void main(String[] args) {
       String[] str={"hi","hello","bye","tc"};
       getStream(str);

//        Stream<String> stream = Arrays.stream(str);
//        stream.forEach(s-> System.out.println(s));

    }

    public static void getStream(String[] str){
        Stream<String> stream=Arrays.stream(str);
        Iterator<String> iterator = stream.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
