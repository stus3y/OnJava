package com.OnJava.Chapter13;

@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

public class TriFunctionTest {
    static int f(int i, long l, double d) { return 99; }

    public static void main(String[] args) {
        TriFunction<Integer, Long, Double, Integer> function = TriFunctionTest::f;
        function = (i, l, d) -> 12;
    }
}
