package com.OnJava.Chapter12.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int rand = random.nextInt(20);
            Integer freq = count.get(rand);
            count.put(rand, freq == null ? 1 : freq + 1);
        }
        System.out.println(count);
    }
}
