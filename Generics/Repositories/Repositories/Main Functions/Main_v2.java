package com.skillsoft.generics;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** A repository for each type of data stored");

        IntegerRepository fifteen = new IntegerRepository(15);
        System.out.println(fifteen);

        DoubleRepository tenPointOne = new DoubleRepository(10.1);
        System.out.println(tenPointOne);

        StringRepository helloGenerics = new StringRepository("Hello generics!");
        System.out.println(helloGenerics);

        DateRepository today = new DateRepository(Calendar.getInstance().getTime());
        System.out.println(today);

        // Run
    }
}
