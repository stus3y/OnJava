package com.OnJava.Chapter14_Stream;

import static com.OnJava.Chapter14_Stream.Repeat.*;

public class Looping {
    static void hi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        repeat(3, () -> System.out.println("Looping!"));
        repeat(2, Looping::hi);
    }
}
