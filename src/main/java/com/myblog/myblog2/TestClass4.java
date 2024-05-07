package com.myblog.myblog2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass4 {

    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8);
       Stream<Integer> lazyStream= num.stream().filter(i->{
           System.out.println("filter:["+i+"]");
           return (i%2)==0;
       }).map(i->{
                   System.out.println("map:["+i+"]");
                  return i;
               }
               );
       for (int i=1;i<=3;i++){
           try{
               Thread.sleep(1000);

           }catch(Exception e){
               e.printStackTrace();

           }
           System.out.println("running...."+i+"sec");
       }
        System.out.println("Going to call collect method...");
        System.out.println("----------------------\n");
        lazyStream.collect(Collectors.toList());

    }
}
