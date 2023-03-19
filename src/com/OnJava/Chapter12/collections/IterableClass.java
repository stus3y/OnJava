package com.OnJava.Chapter12.collections;

import java.util.Iterator;

public class IterableClass implements Iterable<String>{
    protected String[] words = "And where we are going to get the point" . split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String string : new IterableClass()) {
            System.out.print(string + " ");
        }
    }
}
