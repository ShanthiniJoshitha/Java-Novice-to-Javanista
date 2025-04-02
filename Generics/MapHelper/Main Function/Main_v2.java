package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Double> studentsMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        Double[] studentScores = new Double[] {3.2, 2.8, 3.3, 3.8};

        MapHelper mapHelper = new MapHelper();

        mapHelper.addEntries(studentsMap, studentIds, studentScores);

        System.out.println(studentsMap);
    }
}

