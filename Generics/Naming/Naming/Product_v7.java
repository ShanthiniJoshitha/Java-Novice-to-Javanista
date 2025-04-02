package com.skillsoft.generics;

public class Product<__Number__1$> {

    private String name;
    private __Number__1$ id;
    private __Number__1$ price;
    private __Number__1$ discount;

    public Product(String name, __Number__1$ id, __Number__1$ price, __Number__1$ discount) {
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
