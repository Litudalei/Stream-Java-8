package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> departmentlist=new ArrayList<>();
        departmentlist.add("SUPPLY");
        departmentlist.add("HR");
        departmentlist.add("SALES");
        departmentlist.add("DEVOOPS");
        java.util.stream.Stream<String> deptstream =departmentlist.stream();
        deptstream.forEach(System.out::println);
        java.util.stream.Stream<String> deptlist =Stream.of("TESTING","DEVOOPS","OPERATIONAL","DEPLOYMENT");
    deptlist.forEach(System.out::println);
    java.util.stream.Stream<String> deptnewlist =departmentlist.parallelStream();
    deptnewlist.forEach(System.out::println);
    }
}
