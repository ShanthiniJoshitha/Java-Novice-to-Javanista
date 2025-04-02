package com.skillsoft.generics;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>(22);
        System.out.println(integerBox);

        Box<Float> floatBox = new Box<>(22.2f);
        System.out.println(floatBox);

        Box<BigInteger> bigIntegerBox = new Box<>(BigInteger.valueOf(100000000));
        System.out.println(bigIntegerBox);

        Box<String> stringBox = new Box<>("Zoe");
        System.out.println(stringBox);
    }
}



