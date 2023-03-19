package com.OnJava.Chapter6;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    public static void main(String[] args) {
        Random random = new Random(47);
        int[] arr = new int[random.nextInt(20)];
        System.out.println("length of arr = " + arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
