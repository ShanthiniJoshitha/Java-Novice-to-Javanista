package com.skillsoft.generics;

import java.io.Serializable;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Class<String> stringClass = String.class;

        System.out.println("\nName (string): " + stringClass.getName());
        System.out.println("Package (string): " + stringClass.getPackageName());
        System.out.println("Superclass (string): " + stringClass.getSuperclass());
        System.out.println("isInterface (string): " + stringClass.isInterface());

        // Run

        Class<Date> dateClass = Date.class;

        System.out.println("\nName (date): " + dateClass.getName());
        System.out.println("Package (date): " + dateClass.getPackageName());
        System.out.println("Superclass (date): " + dateClass.getSuperclass());
        System.out.println("isInterface (date): " + dateClass.isInterface());

        Class<Serializable> serializableClass = Serializable.class;

        System.out.println("\nName (serializable): " + serializableClass.getName());
        System.out.println("Package (serializable): " + serializableClass.getPackageName());
        System.out.println("Superclass (serializable): " + serializableClass.getSuperclass());
        System.out.println("isInterface (serializable): " + serializableClass.isInterface());
    }
}



