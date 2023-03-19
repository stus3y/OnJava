package com.OnJava.Chapter12.collections;

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(random.nextInt(30));
        }
        System.out.println(hashSet);
    }
}
