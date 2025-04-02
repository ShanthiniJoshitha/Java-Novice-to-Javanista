package com.skillsoft.generics;

public class Product<Number> {

    private String name;
    private Number id;
    private Number price;
    private Number discount;

    public Product(String name, Number id, Number price, Number discount) {
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
