package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.4);
        studentsMap.put("Ophelia", 67.2);
        studentsMap.put("Matthew", 73.8);
        studentsMap.put("Carl", 87.0);

        System.out.println("Average score of students (double scores): " +
                StudentsUtil.computeAverageScore(studentsMap));

        Map<String, Integer> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put("Della", 87);
        anotherStudentsMap.put("Perry", 78);
        anotherStudentsMap.put("Paul", 67);

        System.out.println("Average score of students (integer scores): " +
                StudentsUtil.computeAverageScore(anotherStudentsMap));

        // Run
    }
}



