package com.OnJava.Chapter10.interfaces;

import java.util.Random;

public interface RandomDoubles {
    Random RAND = new Random(47);
    default double next() { return RAND.nextDouble(); }

    public static void main(String[] args) {
        RandomDoubles randomDoubles = new RandomDoubles() {};
        for (int i = 0; i < 7; i++) {
            System.out.println(randomDoubles.next() + " ");
        }
    }
}
