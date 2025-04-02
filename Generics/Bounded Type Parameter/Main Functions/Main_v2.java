package com.skillsoft.generics;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        System.out.println("*************** Invoke the isEven() method");

        System.out.println("Is fifty even: " + MathUtil.isEven("fifty"));

        // Run

        System.out.println("*************** Invoke the isPrime() method");

        System.out.println("Is seventeen prime: " + MathUtil.isPrime("seventeen"));

        System.out.println("Is today's date prime: " + MathUtil.isPrime(new Date()));

        // Run


    }
}



