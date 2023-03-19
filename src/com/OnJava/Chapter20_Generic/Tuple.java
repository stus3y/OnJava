package com.OnJava.Chapter20_Generic;

public class Tuple<A, B> {
    public final A a;
    public final B b;

    public Tuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public String rep() {
        return a + ", " + b;
    }

    @Override
    public String toString() {
        return "( " + rep() + " )";
    }
}
