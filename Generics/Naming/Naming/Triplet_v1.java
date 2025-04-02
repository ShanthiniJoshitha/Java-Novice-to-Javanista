package com.skillsoft.generics;

public class Triplet<T, S, U> {

    private T first;
    private S second;
    private U third;

    public Triplet(T first, S second, U third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public U getThird() {
        return third;
    }

    public void setThird(U third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return String.format("First: %s, Second: %s, Third: %s", first, second, third);
    }
}
