package com.OnJava.Chapter13;

import java.util.function.Function;

interface FuncSS extends Function<String, String> {}

public class ProduceFunction {
    static FuncSS produce() {
        return s -> s.toLowerCase();
    }

    public static void main(String[] args) {
        FuncSS produce = produce();
        System.out.println(produce.apply("YELLING"));
    }
}
