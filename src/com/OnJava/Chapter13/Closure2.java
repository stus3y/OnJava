package com.OnJava.Chapter13;

import java.util.function.IntSupplier;

public class Closure2 {
    IntSupplier makeFun(int x) {
        int i = 0;
        return () -> x + i;
    }
}
