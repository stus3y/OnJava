package com.OnJava.Chapter20_Generic;

public class Manipulator<T> {
    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

    // can't find method f()
    public void manipulate() {
//        obj.f();
    }
}
