package com.OnJava.Chapter20_Generic;

public class GenericHolder<T> {
    private T a;

    public GenericHolder() {
    }

    public void set(T a) { this.a = a; }

    public T get() { return a; }

    public static void main(String[] args) {
        GenericHolder<Automobile> mobile = new GenericHolder<>();
        mobile.set(new Automobile());
        Automobile mobile2 = mobile.get();
//        mobile.set("Not a Automobile");     Error
    }
}
