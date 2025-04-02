package com.skillsoft.generics;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** String representations of generic classes");

        Repository<Integer> integerRepository = new Repository<>(15);
        System.out.println(integerRepository);

        Repository<Double> doubleRepository = new Repository<>(10.2);
        System.out.println(doubleRepository);

        Repository<String> stringRepository = new Repository<>("Hello generics!");
        System.out.println(stringRepository);

        Repository<Date> dateRepository = new Repository<>(Calendar.getInstance().getTime());
        System.out.println(dateRepository);

        // Run
        System.out.println("\n**** Update and access values using generic methods");

        integerRepository.setValue(25);
        doubleRepository.setValue(100.89);
        stringRepository.setValue("Setting a generic value using a method");
        dateRepository.setValue(Calendar.getInstance().getTime());

        System.out.println(integerRepository.getValue());
        System.out.println(doubleRepository.getValue());
        System.out.println(stringRepository.getValue());
        System.out.println(dateRepository.getValue());

        // Run

    }
}
