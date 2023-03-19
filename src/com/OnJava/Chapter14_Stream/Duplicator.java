package com.OnJava.Chapter14_Stream;

import java.util.stream.Stream;

public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(() -> "Duplicator")
                .limit(3)
                .forEach(System.out::println);
    }
}
