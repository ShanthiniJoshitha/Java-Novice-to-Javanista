package com.skillsoft.generics;

public class Main {

    private static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2) {
        if (box1.getValue().compareTo(box2.getValue()) > 0) {
            return box1;
        }

        return box2;
    }

}



