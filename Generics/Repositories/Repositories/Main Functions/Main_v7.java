package com.skillsoft.generics;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Generic repositories");

        Repository<Integer> fifteen = new Repository<>();
        fifteen.value = "fifteen";

        Repository<Double> tenPointOne = new Repository<>();
        tenPointOne.value = 10.1f;

        Repository<String> helloGenerics = new Repository<>();
        helloGenerics.value = 100;

        Repository<Date> today = new Repository<>();
        today.value = "3rd March, 2021";

        // Run
    }
}
