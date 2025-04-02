package com.skillsoft.generics;

public class Product<n> {

    private String name;
    private n id;
    private n price;
    private n discount;

    public Product(String name, n id, n price, n discount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
    }
}
