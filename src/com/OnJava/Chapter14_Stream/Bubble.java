package com.OnJava.Chapter14_Stream;

public class Bubble {
    public final int i;
    private static int count = 0;

    public Bubble(int n) {
        i = n;
    }

    @Override
    public String toString() {
        return "Bubble(" +
                 + i +
                ')';
    }

    public static Bubble bubbler() {
        return new Bubble(count++);
    }
}
