package com.OnJava.Chapter5;

import java.util.Random;

public class EnhanceFor {
    public static void main(String[] args) {
        Random random = new Random(47);

        float f[] = new float[10];

        for (int i = 0; i < f.length; i ++)
            f[i] = random.nextFloat();

        for (float v : f)
            System.out.println(v);

    }
}
