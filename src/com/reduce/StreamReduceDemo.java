package com.reduce;

import java.util.List;
import java.util.Optional;

public class StreamReduceDemo {
    public static void main(String[] args) {
       java.util.List<Integer> integerList = List.of(12,13,6,7,22);
       Integer max =integerList.stream().reduce(0,(a, b)->a>b?a:b);
        System.out.println(max);
    }
}
