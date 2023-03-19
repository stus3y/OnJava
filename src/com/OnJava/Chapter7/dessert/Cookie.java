package com.OnJava.Chapter7.dessert;

public class Cookie {
    public Cookie() {
        System.out.println("Cookie Constructor");
    }

    /**
     * package-local method
     */
    void bite() {
        System.out.println("bite");
    }

    protected void bite(Integer i) {
        System.out.println("bite" + i);
    }

    protected void add() {
        System.out.println("add");
    }

    public void eat() {
        System.out.println("eat");
    }
}
