package com.OnJava.Chapter12.collections;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collections = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collections.addAll(Arrays.asList(moreInts));
        Collections.addAll(collections, 11, 12, 13, 14, 15);
        Collections.addAll(collections, moreInts);
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
//        list.add(21);  // UnsupportedOperationException
    }
}
