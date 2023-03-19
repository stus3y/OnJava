package com.OnJava.Chapter14_Stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionToStream {
    public static void main(String[] args) {
        var bubbles = Arrays.asList(new Bubble(1), new Bubble(2), new Bubble(3));
        System.out.println(bubbles.stream().mapToInt(b -> b.i).sum());

        var words = new HashSet<>(Arrays.asList(
                "It's a wonderful day for pie!".split(" ")
        ));
        words.stream().map(x -> x + " ")
                .forEach(System.out::print);
        System.out.println();

        var map = new HashMap<String, Double>();
        map.put("pi", 3.14159);
        map.put("e", 2.718);
        map.put("phi", 1.618);
        map.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .forEach(System.out::println);
    }
}
