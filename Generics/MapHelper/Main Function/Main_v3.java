package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> studentNamesMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};

        MapHelper<Integer, String> mapHelper1 = new MapHelper<>();

        mapHelper1.addEntries(studentNamesMap, studentIds, studentNames);

        mapHelper1.printEntries(studentNamesMap);
    }
}

