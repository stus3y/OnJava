package com.OnJava.Chapter19_Reflection;

import java.util.stream.Stream;

public class ID2 {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }

    public static void main(String[] args) {
        // public 类默认有无参构造器 不需要自行手写
        Stream.generate(new DynamicSupplier<>(ID2.class))
                .limit(10)
                .skip(5)
                .forEach(System.out::println);
    }
}
