package com.skillsoft.generics;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        MapHelper.displayElements("Key", "Value");

        MapHelper.displayElements(new Date(), new Date());

        MapHelper.displayElements(1045.56, 23456.12);

        // Run
    }
}


