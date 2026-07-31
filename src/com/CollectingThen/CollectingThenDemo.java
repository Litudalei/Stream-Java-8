package com.CollectingThen;

import com.flatmap.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectingThenDemo {
    public static void main(String[] args) {
        java.util.List<Employee> emplist =List.of(new Employee("rohit",12345.6),
                new Employee("Amit",34567.9),
                new Employee("Rahul",56734.9),
                new Employee("Roshan",12346.9),
                new Employee("Musa",43567.8)
                );
        String name=emplist.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                        opt->opt.get().getName()
                )

        );
        System.out.println(name);
    }
}
