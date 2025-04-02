package com.skillsoft.generics;

import java.util.Date;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        MapHelper.displayElements("ID", 10);

        MapHelper.displayElements(10001, new Date());

        MapHelper.displayElements(1045.56, new UUID(123, 567));

        // Run
    }
}

