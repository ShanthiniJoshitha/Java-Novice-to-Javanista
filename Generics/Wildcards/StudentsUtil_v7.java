package com.skillsoft.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsUtil {

    public static List<Object> getScoresAsList(Map<String, ?> studentsMap) {

        List<Object> list = new ArrayList<>();

        for (Map.Entry<String, ?> entry : studentsMap.entrySet()) {
            // NOTE: The data type of the element is unknown, we can only access
            // it using the Object data type
            Object score = entry.getValue();

            // NOTE: This list only needs scores as objects
            list.add(score);
        }

        return list;
    }
}


