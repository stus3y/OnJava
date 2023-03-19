package com.OnJava.Chapter14_Stream;

import static com.OnJava.Chapter14_Stream.RandInts.*;

public class ForEach {
    static final int SIZE = 14;

    public static void main(String[] args) {
        rands().limit(SIZE)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

        rands().limit(SIZE)
                .forEachOrdered(n -> System.out.format("%d ", n));
        System.out.println();

        rands().limit(SIZE)
                .parallel()
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

        rands().limit(SIZE)
                .parallel()
                .forEachOrdered(n -> System.out.format("%d ", n));
    }
}
