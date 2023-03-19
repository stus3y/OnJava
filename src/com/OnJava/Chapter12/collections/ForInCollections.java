package com.OnJava.Chapter12.collections;

import java.util.Collections;
import java.util.LinkedList;

public class ForInCollections {
    public static void main(String[] args) {
        var list = new LinkedList<String>();
        Collections.addAll(list, "Take the long way home".split(" "));
        for (String s : list) {
            System.out.print("'" + s + "' ");
        }
    }
}
