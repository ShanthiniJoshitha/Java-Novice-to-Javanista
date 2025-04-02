package com.skillsoft.generics;

public class Main {

    public static void main(String[] args) {

        Repository<String> stringRepository = new Repository<>("Welcome To Java");
        Repository rawStringRepository = stringRepository;

        System.out.println(rawStringRepository);

        Object stringObject = rawStringRepository.getValue();

        rawStringRepository.setValue("Hi Java");

        System.out.println(rawStringRepository);

        // Run

        rawStringRepository.setValue(10);

        System.out.println("Contains the wrong type! " + rawStringRepository);

        // Run - there will be no error!
    }
}
