package com.skillsoft.generics;

public class Main {

    public static void main(String[] args) {

        Repository rawStringRepository = new Repository("Hello Java");
        System.out.println(rawStringRepository);

        Object stringObject = rawStringRepository.getValue();

        Repository rawFloatRepository = new Repository(12.5f);
        System.out.println(rawFloatRepository);

        Object floatObject = rawFloatRepository.getValue();

        Repository rawBooleanRepository = new Repository(false);
        System.out.println(rawBooleanRepository);

        Object booleanObject = rawBooleanRepository.getValue();

        // Run
    }
}
