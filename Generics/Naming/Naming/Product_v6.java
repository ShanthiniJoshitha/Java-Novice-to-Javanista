package com.skillsoft.generics;

public class Product<Num@#ber> {

    private String name;
    private Num@#ber id;
    private Num@#ber price;
    private Num@#ber discount;

    public Product(String name, Num@#ber id, Num@#ber price, Num@#ber discount) {
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
