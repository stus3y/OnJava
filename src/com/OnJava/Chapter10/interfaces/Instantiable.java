package com.OnJava.Chapter10.interfaces;

public class Instantiable extends Uninstantiable{
    @Override void f() { System.out.println("f"); }

    @Override int g() { return 22; }

    public static void main(String[] args) {
        Instantiable instantiable = new Instantiable();
        instantiable.f();
        System.out.println(instantiable.g());
    }
}
