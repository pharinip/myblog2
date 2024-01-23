package com.myblog.myblog2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass2 {

    public static void main(String[] args) {
        List<Integer> val= Arrays.asList(1,2,3,4,5,6,7,8,9);
        int totalVal=val.stream().filter(n->n%2==0).map(i->i*i).reduce(0,Integer::sum);
        System.out.println(totalVal);


    }
}
