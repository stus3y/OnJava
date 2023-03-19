package com.OnJava.Chapter20_Generic;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Product {
    private final int id;
    private final String desc;
    private double price;

    public Product(int id, String desc, double price) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + desc + ", price: $" + price;
    }

    public void priceChange(double change) {
        this.price += change;
    }

    public static Supplier<Product> generator = new Supplier<Product>() {
        private Random rand = new Random(47);
        @Override
        public Product get() {
            return new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 1000.0) + 0.99);
        }
    };
}

class Shelf extends ArrayList<Product> {
    public Shelf(int nProducts) {
        Suppliers.fill(this, Product.generator, nProducts);
    }
}

class Aisle extends ArrayList<Shelf> {
    Aisle(int nShelves, int nProducts) {
        for (int i = 0; i < nShelves; i++) {
            add(new Shelf(nProducts));
        }
    }
}

class CheckoutStand {}
class Office {}

