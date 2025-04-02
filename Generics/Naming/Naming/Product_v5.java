package com.skillsoft.generics;

public class Product<123Number> {

    private String name;
    private 123Number id;
    private 123Number price;
    private 123Number discount;

    public Product(String name, 123Number id, 123Number price, 123Number discount) {
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
