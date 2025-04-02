package com.skillsoft.generics;

public class Repository<T> {

    @SuppressWarnings("unchecked")
    private T value = (T) "Initial value";

    public Repository() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Repository contains: %s", value);
    }
}
