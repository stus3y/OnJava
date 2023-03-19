package com.OnJava.Chapter14_Stream;

import java.io.IOException;

public class Peeking {
    public static void main(String[] args) throws IOException {
        FileToWords.stream("./src/com/OnJava/Chapter14/Cheese.dat")
                .skip(21)
                .limit(4)
                .map(w -> w + " ")
                .peek(System.out::print)
                .map(String::toLowerCase)
                .peek(System.out::print)
                .map(String::toUpperCase)
                .forEach(System.out::print);
    }
}
