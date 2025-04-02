package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Number> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45);
        studentsMap.put("Ophelia", 67);
        studentsMap.put("Matthew", 73);
        studentsMap.put("Carl", 87);

        System.out.println("Average score of students: " +
                StudentsUtil.computeAverageScore(studentsMap));
    }
}



