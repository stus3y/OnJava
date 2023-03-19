package com.OnJava.Chapter12.collections;

import java.util.ArrayList;

public class AppleAndOrangeWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // 编译时就会报错
//        apples.add(new Orange());
        for (Apple apple : apples) {
            System.out.println(apple.id());
        }
    }
}
