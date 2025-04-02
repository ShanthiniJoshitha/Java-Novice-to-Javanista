package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Float> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.4f);
        studentsMap.put("Ophelia", 67.2f);
        studentsMap.put("Matthew", 73.8f);
        studentsMap.put("Carl", 87.0f);

        System.out.println("Average score of students: " +
                StudentsUtil.computeAverageScore(studentsMap));
    }
}



