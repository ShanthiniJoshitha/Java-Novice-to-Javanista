package com.skillsoft.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        System.out.println("ArrayList instanceof List: " + (courses instanceof List));
        System.out.println("ArrayList instanceof Collection: " + (courses instanceof Collection));
        System.out.println("ArrayList instanceof Iterable: " + (courses instanceof Iterable));
    }
}



