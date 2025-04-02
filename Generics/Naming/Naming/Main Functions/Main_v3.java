package com.skillsoft.generics;

public class Main {

    public static void main(String[] args) {

        Triplet<Integer, String, Double> triplet1 = new Triplet<>(
                2112, "The Game of Thrones", 6.99);
        System.out.println("\nInteger-String-Double triplet: " + triplet1);

        Triplet<String, Integer, Car> triplet2 = new Triplet<>(
                "John", 21, new Car("Tesla", "Model S", 79000));
        System.out.println("\nString-Integer-Car triplet: " + triplet2);
    }
}

