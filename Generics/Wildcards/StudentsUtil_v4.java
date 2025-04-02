package com.skillsoft.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsUtil {

    public static <T extends Number> List<T> getScoresAsList(Map<String, T> studentsMap) {

        List<T> list = new ArrayList<>();

        for (Map.Entry<String, T> entry : studentsMap.entrySet()) {
            T score = entry.getValue();

            list.add(score);
        }

        return list;
    }
}


