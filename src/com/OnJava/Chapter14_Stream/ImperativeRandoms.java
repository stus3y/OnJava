package com.OnJava.Chapter14_Stream;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class ImperativeRandoms {
    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> set = new TreeSet<>();
        while (set.size() < 7) {
            int r = random.nextInt(20);
            if(r < 5) continue;
            set.add(r);
        }
        System.out.println(set);
    }
}
