package com.OnJava.Chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Closure8 {
    Supplier<List<Integer>> makeFun() {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        return () -> list;
    }

    public static void main(String[] args) {
        Closure8 c8 = new Closure8();
        List<Integer> l1 = c8.makeFun().get(),
                      l2 = c8.makeFun().get();
        System.out.println(l1);
        System.out.println(l2);
        l1.add(42);
        l2.add(96);
        System.out.println(l1);
        System.out.println(l2);
    }
}
