package com.skillsoft.generics;

import java.util.Map;

public class StudentsUtil {

    public static void printMapEntries(Map<?, ?> map) {

        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.format("Key: %s, Value: %s\n", entry.getKey(), entry.getValue());
        }
    }
}


