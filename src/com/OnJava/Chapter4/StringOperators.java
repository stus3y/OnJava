package com.OnJava.Chapter4;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z= 2;
        String s = "x, y, z";
        System.out.println(s + x + y + z);
        System.out.println(x + y + z + s);
        System.out.println(x + z + s + y + z);
    }
}
