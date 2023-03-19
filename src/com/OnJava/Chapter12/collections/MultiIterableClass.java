package com.OnJava.Chapter12.collections;

import java.util.*;

public class MultiIterableClass extends IterableClass {
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length -1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<String> randomSized() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> strings = new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(strings, new Random(47));
                return strings.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass strings = new MultiIterableClass();
        for (String s : strings.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : strings.randomSized()) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}
