package com.OnJava.Chapter5;

public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        while (condition()) {
            System.out.println(" Inside while " + i);
            i++ ;
        }
        System.out.println("Exit");
    }

    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println("result = " + result);
        return result;
    }
}
