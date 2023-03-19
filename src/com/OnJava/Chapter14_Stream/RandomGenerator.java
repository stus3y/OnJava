package com.OnJava.Chapter14_Stream;

import java.util.Random;
import java.util.stream.Stream;

public class RandomGenerator {
    public static<T> void show(Stream<T> stream) {
        stream.limit(4).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        show(random.ints().boxed());
        show(random.longs().boxed());
        show(random.doubles().boxed());

        show(random.ints(10, 20).boxed());
        show(random.longs(50, 100).boxed());
        show(random.doubles(0, 1).boxed());

        show(random.ints(3, 3, 9).boxed());
        show(random.longs(3, 3, 9).boxed());
        show(random.doubles(3, 3, 9).boxed());
    }
}
