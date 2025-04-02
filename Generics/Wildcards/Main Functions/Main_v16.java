package com.skillsoft.generics;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> juliesCourses = new LinkedList<>();
        juliesCourses.add("Math");
        juliesCourses.add("Art");
        juliesCourses.add("Java");

        LinkedList<String> andrewsCourses = new LinkedList<>();
        andrewsCourses.add("Chemistry");
        andrewsCourses.add("English");

        Map<String, Collection<String>> coursesMap = new HashMap<>();
        coursesMap.put("Julie", juliesCourses);
        coursesMap.put("Andrew", andrewsCourses);

        StudentsUtil.printMapEntries(coursesMap);
    }
}



