package com.OnJava.Chapter13;

import java.util.function.IntSupplier;

public class Closure4 {
    IntSupplier makeFun(final int x) {
        final int i = 0;
        return () -> i + x;
    }
}
