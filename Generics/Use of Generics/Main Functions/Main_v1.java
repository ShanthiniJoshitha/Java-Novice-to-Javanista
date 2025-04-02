package com.skillsoft.generics;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Generic class with custom type");

        Car honda = new Car("Honda", "Civic", 21000);

        Repository<Car> carRepository = new Repository<Car>(honda);
        System.out.println(carRepository);
    }
}
