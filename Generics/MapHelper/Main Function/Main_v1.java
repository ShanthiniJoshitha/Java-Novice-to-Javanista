package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};

        MapHelper mapHelper = new MapHelper();

        mapHelper.addEntries(studentsMap, studentIds, studentNames);

        System.out.println(studentsMap);
    }
}

