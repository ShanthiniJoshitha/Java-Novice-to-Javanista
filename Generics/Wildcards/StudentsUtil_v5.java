package com.skillsoft.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsUtil {

    public static List<? extends Number> getScoresAsList(Map<String, ? extends Number> studentsMap) {

        List<? extends Number> list = new ArrayList<>();

        for (Map.Entry<String, ? extends Number> entry : studentsMap.entrySet()) {
            // NOTE: The data type of the element is unknown, we can only access
            // it using the Object data type
            Object score = entry.getValue();

            // NOTE: This method requires the actual data type of the element
            // being added, that is not available when we use upper bounded wildcards
            list.add(score);
        }

        return list;
    }
}


