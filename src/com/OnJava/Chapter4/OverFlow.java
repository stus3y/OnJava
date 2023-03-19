package com.OnJava.Chapter4;

public class OverFlow {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        // OverFlow
        System.out.println(a * a);
    }
}
