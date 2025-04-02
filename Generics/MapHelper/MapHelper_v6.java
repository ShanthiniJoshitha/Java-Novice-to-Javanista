package com.skillsoft.generics;

import java.util.Map;

public class MapHelper {

    public static <K, V> void addEntries(Map<K, V> map, K[] keys, V[] values) {

        int index = 0;
        for (K key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }

    public static <K, V> void printEntries(Map<K, V> map) {
        System.out.println("\n*************Map entries");

        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
