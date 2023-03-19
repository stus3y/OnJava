package com.OnJava.Chapter20_Generic.coffee;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CoffeeSupplier implements Supplier<Coffee>, Iterable<Coffee> {
    private Class<?>[] types = { Latte.class, Americano.class, Cappuccino.class, Mocha.class };
    private static Random rand = new Random(47);
    private int size = 0;

    public CoffeeSupplier() {}
    public CoffeeSupplier(int size) { this.size = size; }

    @Override
    public Coffee get() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Coffee next() {
            count --;
            return CoffeeSupplier.this.get();
        }

        @Override
        public boolean hasNext() {
            return count > 0;
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        Stream.generate(new CoffeeSupplier())
                .limit(5)
                .forEach(System.out::println);

        for (Coffee c : new CoffeeSupplier(3)) {
            System.out.println(c);
        }
    }
}
