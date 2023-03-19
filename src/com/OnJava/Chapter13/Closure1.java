package com.OnJava.Chapter13;

import java.util.function.IntSupplier;

public class Closure1 {
    int i;
    IntSupplier makeFun(int x) {
        return () -> x + i++;
    }
}
