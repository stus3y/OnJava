package com.OnJava.Chapter20_Generic;

import java.util.ArrayList;

public class Store extends ArrayList<Aisle> {
    private final ArrayList<CheckoutStand> checkouts = new ArrayList<>();
    private final Office office = new Office();
    public Store(int nAisles, int nShelves, int nProducts) {
        for (int i = 0; i < nAisles; i++) {
            add(new Aisle(nShelves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Aisle shelves : this) {
            for (Shelf shelf : shelves) {
                for (Product product : shelf) {
                    result.append(product);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(5, 4 ,3));
    }
}
