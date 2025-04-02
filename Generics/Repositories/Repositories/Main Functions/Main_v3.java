package com.skillsoft.generics;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** A single repository holding objects");

        Repository fifteen = new Repository(15);
        System.out.println(fifteen);

        Repository tenPointOne = new Repository(10.1);
        System.out.println(tenPointOne);

        Repository helloGenerics = new Repository("Hello generics!");
        System.out.println(helloGenerics);

        Repository today = new Repository(Calendar.getInstance().getTime());
        System.out.println(today);

        // Run
    }
}
