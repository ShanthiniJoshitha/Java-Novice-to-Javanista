package com.skillsoft.generics;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> juliesCourses = new ArrayList<>();
        juliesCourses.add("Math");
        juliesCourses.add("Art");
        juliesCourses.add("Java");

        ArrayList<String> andrewsCourses = new ArrayList<>();
        andrewsCourses.add("Chemistry");
        andrewsCourses.add("English");

        Map<String, ArrayList<String>> coursesMap = new HashMap<>();
        coursesMap.put("Julie", juliesCourses);
        coursesMap.put("Andrew", andrewsCourses);

        StudentsUtil.printMapEntries(coursesMap);
    }
}



