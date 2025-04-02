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

        StudentsUtil.printMapEntries(studentsMap);

        System.out.println("\n****************");

        Map<Integer, String> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put(1001, "Della");
        anotherStudentsMap.put(1002, "Perry");
        anotherStudentsMap.put(1003, "Paul");

        StudentsUtil.printMapEntries(anotherStudentsMap);
        // Run
    }
}



