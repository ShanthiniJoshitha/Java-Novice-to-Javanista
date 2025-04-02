package com.skillsoft.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.4);
        studentsMap.put("Ophelia", 67.2);
        studentsMap.put("Matthew", 73.8);
        studentsMap.put("Carl", 87.0);

        List<Object> scoresList = StudentsUtil.getScoresAsList(studentsMap);
        System.out.println("Scores list (objects): " + scoresList);

        Map<String, Integer> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put("Della", 87);
        anotherStudentsMap.put("Perry", 78);
        anotherStudentsMap.put("Paul", 67);

        List<Object> anotherScoresList = StudentsUtil.getScoresAsList(anotherStudentsMap);
        System.out.println("Another scores list (objects): " + anotherScoresList);

        // Run
    }
}



