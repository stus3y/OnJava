package com.OnJava.Chapter10.interfaces;

interface AnInterface {
    void first();
    void second();
    default void third() {
        System.out.println("new Method");
    }
}

public class AnImplementation implements AnInterface{
    @Override
    public void first() {

    }

    @Override
    public void second() {

    }

    public static void main(String[] args) {
        AnImplementation anImplementation = new AnImplementation();
        anImplementation.third();
    }
}
