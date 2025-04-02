package com.pack.repository;

public class DoubleRepository {
    private Double value;

    public DoubleRepository(Double value) {
        this.value = value;
    }

    public  Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Double Repository contains: %f", value);
    }
}
