package com.OnJava.Chapter12.collections;

import java.util.TreeSet;

public class SortedSetOfString {
    public static void main(String[] args) {
        var set = new TreeSet<String>();
        for (int i = 0; i < 100; i++) {
            set.add("Yellow");
            set.add("Red");
            set.add("Blue");
            set.add("Orange");
            set.add("Purple");
        }
        System.out.println(set);
    }
}
