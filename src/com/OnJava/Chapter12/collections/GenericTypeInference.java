package com.OnJava.Chapter12.collections;

import java.util.ArrayList;

public class GenericTypeInference {
    void old() {
        ArrayList<Apple> apples = new ArrayList<>();
    }

    void modern() {
        var apples = new ArrayList<Apple>();
    }

    void pitFall() {
        var apples = new ArrayList<>();
        apples.add(new Apple());
        apples.get(0);
    }
}
