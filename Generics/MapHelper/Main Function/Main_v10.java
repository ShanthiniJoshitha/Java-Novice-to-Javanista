package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Alice");
        map1.put(2, "Bob");
        map1.put(3, "Charlie");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(3, "Charlie");
        map2.put(2, "Bob");
        map2.put(1, "Alice");

        System.out.println("Are the maps equal? " + MapHelper.mapEquals(map1, map2));

        // Run
    }
}


