package com.skillsoft.generics;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Wrong casting leads to runtime errors");

        Repository<Car> carRepository = new Repository<Car>();
        Car car = carRepository.getValue();
    }
}
