package com.OnJava.Chapter12.collections;

import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
    ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    /**
     * 适配器方法  用于自定义Iterator
     */
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current =  size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> strings = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();

        for (String string : strings.reversed()) {
            System.out.print(string + " ");
        }
    }
}
