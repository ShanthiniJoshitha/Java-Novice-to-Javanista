package com.skillsoft.generics;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Accessing values with the right type");

        Repository fifteen = new Repository(15);

        Integer integerVal = (Integer) fifteen.getValue();
        System.out.println("Accessing integer: " + integerVal);

        Repository tenPointOne = new Repository(10.1);

        Double doubleVal = (Double) tenPointOne.getValue();
        System.out.println("Accessing double: " + doubleVal);

        Repository helloGenerics = new Repository("Hello generics!");

        String stringVal = (String) helloGenerics.getValue();
        System.out.println("Accessing string: " + stringVal);

        // Run

        Repository today = new Repository(Calendar.getInstance().getTime());

        String dateVal = (String) today.getValue();
        System.out.println("Accessing date (wrong cast!): " + dateVal);

        // Run - this last one will be a runtime error
    }
}
