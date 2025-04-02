package com.skillsoft.generics;

import java.util.Map;

public class MapHelper {

    public void addEntries(Map<Integer, String> map, Integer[] keys, String[] values) {

        int index = 0;
        for (Integer key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }

    public void addEntries(Map<Integer, Double> map, Integer[] keys, Double[] values) {

        int index = 0;
        for (Integer key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }

    public void printEntries(Map<Integer, String> map) {
        System.out.println("\n*************Map entries");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
