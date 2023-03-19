package com.OnJava.Chapter14_Stream;

import java.util.stream.Stream;

public class Fibonacci {
    int i = 1;

    Stream<Integer> cal() {
        return Stream.iterate(0, x -> {
            int result = i + x;
            i = x;
            return result;
        });
    }

    public static void main(String[] args) {
        new Fibonacci().cal()
                .limit(40)
                .forEach(System.out::println);
    }
}
