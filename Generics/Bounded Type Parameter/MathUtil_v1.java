package com.skillsoft.generics;

public class MathUtil {

    public static <T> boolean isEven(T element) {

        Number number = (Number) element;

        return number.doubleValue() % 2 == 0;
    }

    public static <T> boolean isPrime(T element) {

        Number number = (Number) element;

        int num = number.intValue() / 2;

        for (int i = 2; i <= num; i++) {

            if (number.intValue() % i == 0) {
                return false;
            }
        }

        return true;
    }
}
