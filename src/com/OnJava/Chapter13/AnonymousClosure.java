package com.OnJava.Chapter13;

import java.util.function.IntSupplier;

public class AnonymousClosure {
    IntSupplier makeFun(int x) {
        int i = 0;
//        i ++;
//        x ++;
        return new IntSupplier() {
            @Override
            public int getAsInt() {
                return i + x;
            }
        };
    }
}
