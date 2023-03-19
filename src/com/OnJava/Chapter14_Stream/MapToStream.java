package com.OnJava.Chapter14_Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MapToStream {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "World");
        map.put(3, "Every");
        map.put(4, "One");

        map.entrySet().stream()
                .filter(e -> e.getKey() > 2)
                .forEach(e -> System.out.println(e.getKey() + "=>" + e.getValue()));
    }
}
