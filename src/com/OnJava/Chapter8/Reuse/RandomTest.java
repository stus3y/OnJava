package com.OnJava.Chapter8.Reuse;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(20));
        }
    }
}
