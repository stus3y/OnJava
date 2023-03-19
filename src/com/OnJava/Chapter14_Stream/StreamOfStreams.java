package com.OnJava.Chapter14_Stream;

import java.util.stream.Stream;

public class StreamOfStreams {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .map(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
                .map(i -> i.getClass().getName())
                .forEach(System.out::println);
    }
}
