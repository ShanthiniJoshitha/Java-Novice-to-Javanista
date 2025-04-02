package com.skillsoft.generics;

import java.util.Map;

public class StudentsUtil {

    public static <T extends Number> double computeAverageScore(Map<String, T> studentsMap) {

        double totalScore = 0;
        int count = 0;

        for (Map.Entry<String, T> entry : studentsMap.entrySet()) {
            totalScore += entry.getValue().doubleValue();
            count++;
        }

        return totalScore / count;
    }
}


