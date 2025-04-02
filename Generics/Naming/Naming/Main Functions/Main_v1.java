package com.skillsoft.generics;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        Product<Integer> product = new Product<>("iPhone", 1001, 699, 10);
        System.out.println("\nInteger id, price, and discount: " + product);

        // Run

        Product<BigInteger> tv = new Product<>(
                "Samsung", BigInteger.valueOf(11011),
                BigInteger.valueOf(2000), BigInteger.valueOf(500));
        System.out.println("\nBigInteger id, price, and discount: " + product);

        Product<Float> shoes = new Product<>("Nike", 1111.0f, 200.75f, 5.5f);
        System.out.println("\nFloat id, price, and discount: " + product);

        // Run
    }
}

