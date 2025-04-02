package com.skillsoft.generics;

public class Main {

    private static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2) {
        if (box1.getValue().compareTo(box2.getValue()) > 0) {
            return box1;
        }

        return box2;
    }

    public static void main(String[] args) {

        Box<Integer> integerBox1 = new Box<>(22);
        System.out.println(integerBox1);

        Box<Integer> integerBox2 = new Box<>(99);
        System.out.println(integerBox2);

        System.out.println("Larger box: " + getLarger(integerBox1, integerBox2));
    }
}



