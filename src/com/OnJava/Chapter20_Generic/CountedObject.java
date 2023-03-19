package com.OnJava.Chapter20_Generic;

public class CountedObject {
    private static long counter = 0;
    private final long id = counter ++;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
