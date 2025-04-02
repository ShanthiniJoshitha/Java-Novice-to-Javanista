package com.skillsoft.generics;

public class Car implements Comparable<Car> {

    public String make;
    public String model;
    public Integer price;

    public Car(String make, String model, Integer price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("{Make: %s, Model: %s, Price: %s}", make, model, price);
    }

    
}
