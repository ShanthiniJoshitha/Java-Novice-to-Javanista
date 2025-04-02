package com.skillsoft.generics;

import java.util.Map;

public class StudentsUtil {

    public static double computeAverageScore(Map<String, Number> studentsMap) {

        double totalScore = 0;
        int count = 0;

        for (Map.Entry<String, Number> entry : studentsMap.entrySet()) {
            totalScore += entry.getValue().doubleValue();
            count++;
        }

        return totalScore / count;
    }
}


