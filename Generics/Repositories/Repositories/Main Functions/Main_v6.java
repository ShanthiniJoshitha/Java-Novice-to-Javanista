package com.skillsoft.generics;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Generic repositories");

        Repository<Integer> fifteen = new Repository<>();
        Repository<Double> tenPointOne = new Repository<>();
        Repository<String> helloGenerics = new Repository<>();
        Repository<Date> today = new Repository<>();

        // Run
    }
}
