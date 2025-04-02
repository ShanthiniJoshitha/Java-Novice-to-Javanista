package com.skillsoft.generics;

public class Product<N> {

    private String name;
    private N id;
    private N price;
    private N discount;

    public Product(String name, N id, N price, N discount) {
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
