package com.skillsoft.generics;

public class Repository<T> {

   private T value = 10;

    public Repository(T value) {
        
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
