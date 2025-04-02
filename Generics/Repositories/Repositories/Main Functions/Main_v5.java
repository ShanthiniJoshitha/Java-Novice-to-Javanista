package com.skillsoft.generics;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Generic repositories");

        Repository<Integer> fifteen = new Repository<Integer>();
        fifteen.value = 15;

        System.out.println("\nInteger repository: " + fifteen.value);
        System.out.println("Integer repository holds an integer class type: " + fifteen.value.getClass());

        // Run

        Repository<Double> tenPointOne = new Repository<Double>();
        tenPointOne.value = 10.1;

        System.out.println("\nDouble repository: " + tenPointOne.value);
        System.out.println("Double repository holds an double class type: " + tenPointOne.value.getClass());

        // Run

        Repository<String> helloGenerics = new Repository<String>();
        helloGenerics.value = "Hello generics!";

        System.out.println("\nString repository: " + helloGenerics.value);
        System.out.println("String repository holds an string class type: " + helloGenerics.value.getClass());

        Repository<Date> today = new Repository<Date>();
        today.value = Calendar.getInstance().getTime();

        System.out.println("\nDate repository: " + today.value);
        System.out.println("Date repository holds an date class type: " + today.value.getClass());

        // Run
    }
}
