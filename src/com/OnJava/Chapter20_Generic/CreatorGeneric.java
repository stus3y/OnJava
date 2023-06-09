package com.OnJava.Chapter20_Generic;

abstract class GenericWithCreate<T> {
    final T element;
    abstract T create();
    public GenericWithCreate() {
        element = create();
    }
}

class X {}

class XCreator extends GenericWithCreate<X> {
    @Override
    X create() {
        return new X();
    }
    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}

public class CreatorGeneric {
    public static void main(String[] args) {
        XCreator xc = new XCreator();
        xc.f();
    }
}
