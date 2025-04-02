package com.skillsoft.generics;

import java.util.ArrayList;
import java.util.Map;

public class StudentsUtil {

    public static void printMapEntries(Map<String, ? super ArrayList<String>> map) {

        for (Map.Entry<String, ? super ArrayList<String>> entry : map.entrySet()) {
            System.out.println("----------------------");

            // NOTE: We only access the toString() method of the key and the value
            // which is a part of the Object base class
            System.out.println(entry);
            System.out.println("----------------------");
        }
    }

}


