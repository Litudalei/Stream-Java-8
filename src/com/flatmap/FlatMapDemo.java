package com.flatmap;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {
        java.util.List<Person> personList =Arrays.asList(new Person("Tapan",Arrays.asList("87888","61715")),
                       new Person("Gitiranjan",Arrays.asList("77777","765432","21346")));
        personList.stream().flatMap(person->person.getPhoneNumbers().stream()).forEach(System.out::println);
    }
}
