package com.skillsoft.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsUtil {

    public static List<Object> getScoresAsList(Map<String, Object> studentsMap) {

        List<Object> list = new ArrayList<>();

        for (Map.Entry<String, Object> entry : studentsMap.entrySet()) {
            Object score = entry.getValue();

            list.add(score);
        }

        return list;
    }
}


