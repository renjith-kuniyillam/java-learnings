package org.modularization;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String , Long> list1 = new HashMap<>();
        list1.put("a", 1L);
        list1.put("b", 1L);
        list1.put("c", 3L);
        Map<String , Long> list2 = new HashMap<>();
        list2.put("a", 1L);
        list2.put("b", 1L);
        list2.put("c", 3L);
        Map<String , Long> list3 = new HashMap<>();
        list3.put("a", 1L);
        list3.put("b", 1L);
        list3.put("c", 3L);
        Map<String , Long> list4 = new HashMap<>();
        list4.put("a", 1L);
        list4.put("b", 1L);
        list4.put("c", 3L);

        Stream<Long> testStream = Stream.of(list1.values().stream(), list2.values().stream(), list3.values().stream(), list4.values().stream())
                .flatMap(s -> s);
        if(testStream.anyMatch(s -> s == 0)) {
            System.out.println("Found 0");
        } else {
            System.out.println("Not Found 0");
        }


    }
}