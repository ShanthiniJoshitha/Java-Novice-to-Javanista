package com.skillsoft.generics;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(2112, "The Game of Thrones");
        System.out.println("\nInteger-String pair: " + pair1);

        Pair<Integer, Car> pair2 = new Pair<>(21, new Car("Tesla", "Model S", 79000));
        System.out.println("\nInteger-Car pair: " + pair2);

        Pair<Car, Date> pair3 = new Pair<>(new Car("Honda", "Civic", 23000), new Date());
        System.out.println("\nCar-Date pair: " + pair3);
    }
}

