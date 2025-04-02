package com.skillsoft.generics;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        IntegerRepository fifteen = new IntegerRepository(15);
        System.out.println(fifteen);

        IntegerRepository oneHundredOne = new IntegerRepository(101);
        System.out.println(oneHundredOne);

        // Run

        IntegerRepository tenPointOne = new IntegerRepository(10.1);

        IntegerRepository helloGenerics = new IntegerRepository("Hello generics!");

        IntegerRepository today = new IntegerRepository(Calendar.getInstance().getTime());

        // Hover over each red line and show the error
        // Run the code and show the error
    }
}
