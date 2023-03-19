package com.OnJava.Chapter14_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStream {
    public static void main(String[] args) {
        Integer[] ints = { 1, 2, 3, 4, 5};

        // 1. Arrays 转化
        Arrays.stream(ints).distinct()
                .map(n -> n + 555)
                .forEach(n -> System.out.format("%d ", n));

        // 2. Stream.of 转化
        Stream<Integer> stream = Stream.of(ints);
    }
}
