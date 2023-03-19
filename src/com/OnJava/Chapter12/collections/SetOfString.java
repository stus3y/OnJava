package com.OnJava.Chapter12.collections;

import java.util.HashSet;

public class SetOfString {
    public static void main(String[] args) {
        var colors = new HashSet<String>();
        for (int i = 0; i < 100; i++) {
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Red");
            colors.add("Pink");
        }
        System.out.println(colors);
    }
}
