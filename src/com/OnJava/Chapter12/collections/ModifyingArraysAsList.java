package com.OnJava.Chapter12.collections;

import java.util.*;

public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] arr = {1, 2, 4, 5, 9, 5, 6};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(list, random);
        System.out.println("After shuffling " + list);
        System.out.println("Origin " + Arrays.toString(arr));

        List<Integer> list2 = Arrays.asList(arr);
        Collections.shuffle(list2, random);
        System.out.println("After shuffling " + list2);
        System.out.println("Origin" + Arrays.toString(arr));
    }
}
