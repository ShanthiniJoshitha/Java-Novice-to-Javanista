package com.pack.repository;

import java.util.Date;

public class DateRepository {

    private Date value;

    public DateRepository(Date value) {
        this.value = value;
    }

    public  Date getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Date Repository contains: %s", value);
    }
}
