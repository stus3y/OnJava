package com.OnJava.Chapter20_Generic;

import java.util.ArrayList;
import java.util.List;

public class ListMaker<T> {
    List<T> create() { return new ArrayList<>(); }

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<>();
        List<String> strings = stringMaker.create();
    }
}
