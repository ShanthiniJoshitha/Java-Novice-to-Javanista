package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> studentNamesMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};

        MapHelper.<Integer, String>addEntries(studentNamesMap, studentIds, studentNames);

        MapHelper.<Integer, String>printEntries(studentNamesMap);

        // Run

        Map<Integer, Double> studentScoresMap = new HashMap<>();

        Double[] studentScores = new Double[] {3.2, 2.8, 3.3, 3.8};

        MapHelper.<Integer, Double>addEntries(studentScoresMap, studentIds, studentScores);

        MapHelper.<Integer, Double>printEntries(studentScoresMap);

        // Run
    }
}

