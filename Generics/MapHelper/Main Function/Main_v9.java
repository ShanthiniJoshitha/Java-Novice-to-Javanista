package com.skillsoft.generics;

import java.util.Date;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        MapHelper.displayElements(100, 200, 300, 400);

        MapHelper.displayElements("Key", "Value", new Date(), new UUID(543, 98765));

        MapHelper.displayElements(new Date(), "Hello", 123.4);

        // Run
    }
}


