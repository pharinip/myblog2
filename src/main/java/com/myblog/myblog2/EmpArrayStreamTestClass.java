package com.myblog.myblog2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpArrayStreamTestClass {

    public static void main(String[] args) {


        Employee[] emp={
                new Employee("mike",67,"kolar"),
                new Employee("sam",59,"banglore"),
                new Employee("kat",40,"kolar")
        };

//       Arrays.stream(emp).filter(i->i.getAge()>50).map(e->e.getName()).forEach(System.out::println);
        Stream<Employee> str=Arrays.stream(emp);
        List<String> collect = str.filter(i -> i.getAge() > 50).map(Employee::getName).collect(Collectors.toList());
        System.out.println(collect);

    }
}
