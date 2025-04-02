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

        System.out.println("Average score of students (double scores): " +
                StudentsUtil.computeAverageScore(studentsMap));

        Map<Integer, Integer> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put(1001, 87);
        anotherStudentsMap.put(1002, 78);
        anotherStudentsMap.put(1003, 67);

        System.out.println("Average score of students (integer scores): " +
                StudentsUtil.computeAverageScore(anotherStudentsMap));

        // Run
    }
}



