package com.OnJava.Chapter6;

public class IntegerArray {
    public static void main(String[] args) {
        int a1[] = { 1, 2, 3, 4, 5 };
        int a2[];
        a2 = a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i] += 1;
        }
        for (int i : a1) {
            System.out.println(i);
        }
    }
}
