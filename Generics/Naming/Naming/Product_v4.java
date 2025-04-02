package com.skillsoft.generics;

public class Product<CaNBeAnYThinG> {

    private String name;
    private CaNBeAnYThinG id;
    private CaNBeAnYThinG price;
    private CaNBeAnYThinG discount;

    public Product(String name, CaNBeAnYThinG id, CaNBeAnYThinG price, CaNBeAnYThinG discount) {
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
