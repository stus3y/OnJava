package com.OnJava.Chapter4;

import java.util.Random;

public class MathOps {
    public static void main(String[] args) {
        Random random = new Random(47);

        int i, j, k;

        j = random.nextInt(100) + 1;
        System.out.println("j : " + j);

        k = random.nextInt(100) + 1;
        System.out.println("k : " + k);

        i = j + k;
        System.out.println("j + k : " + i);

        i = j - k;
        System.out.println("j - k : " + i);

        i = j / k;
        System.out.println("j / k : " + i);

        i = j * k;
        System.out.println("j * k : " + i);

        i = j % k;
        System.out.println("j % k : " + i);

        j %= k;
        System.out.println("j % k : " + j);

        System.out.println("====================");

        float u, v, w;

        u = random.nextFloat();
        System.out.println("u : " + u);

        v = random.nextFloat();
        System.out.println("v : " + v);

        w = u + v;
        System.out.println("u + v : " + w);

        w = u - v;
        System.out.println("u - v : " + w);

        w = u / v;
        System.out.println("u / v : " + w);

        w = u * v;
        System.out.println("u * v : " + w);

        w = u % v;
        System.out.println("u % v : " + w);
    }
}
