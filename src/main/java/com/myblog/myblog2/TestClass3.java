package com.myblog.myblog2;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass3 {

    public static void main(String[] args) {
        List<Employee> emp=Arrays.asList(
                new Employee("mike",30,"chennai"),
                new Employee("sam",45,"kolar"),
                new Employee("kat",31,"chennai"),
                new Employee("smith",31,"bangalore")
        );

//        List<Employee> data=emp.stream().filter(n->n.getAge()>30).collect(Collectors.toList());
//
//        for(Employee e:data){
//            System.out.println(e.getName());
//            System.out.println(e.getAge());
//            System.out.println(e.getCity());
//        }

        Map<Integer, List<Employee>> collect = emp.stream().collect(Collectors.groupingBy(e -> e.getAge()));
       for(Map.Entry<Integer,List<Employee>> entry:collect.entrySet()){
          int age=entry.getKey();
          List<Employee> employeesWithAge=entry.getValue();

           System.out.println("People with age"+age+":");
           for(Employee e:employeesWithAge){
               System.out.println(e.getName());
               System.out.println(e.getCity());
               System.out.println(e.getAge());
           }
        }

    }
}
