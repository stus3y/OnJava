package com.OnJava.Chapter7;

class Soup1 {
    private Soup1() {}
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}
    public static Soup2 sp = new Soup2();

    public static Soup2 access() {
        return sp;
    }

    public void f() {}
}

public class Lunch {
    void testPrivate() {
//        new Soup1()
    }

    void testStatic() {
        Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
