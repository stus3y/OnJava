package com.OnJava.Chapter20_Generic;

public class Manipulator3 {
    private HasF obj;

    public Manipulator3(HasF obj) {
        this.obj = obj;
    }

    public void manipulate() {
        obj.f();
    }
}
