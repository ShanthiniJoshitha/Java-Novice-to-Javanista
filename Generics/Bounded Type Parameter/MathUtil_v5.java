package com.skillsoft.generics;

import java.math.BigInteger;

public class MathUtil {

   public static <T extends Number> boolean isEven(T element) {
        return element.doubleValue() % 2 == 0;
    }

    public static <T extends Integer> boolean isPrime(T element) {

        int num = element.intValue() / 2;

        for (int i = 2; i <= num; i++) {

            if (element.longValue() % i == 0) {
                return false;
            }
        }

        return true;
    }
