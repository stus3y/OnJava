package com.OnJava.Chapter11.innerclasses;

interface A {}
interface B {}

/**
 * 使用单一类
 */
class X implements A, B {}

/**
 * 使用内部类
 */
class Y implements A {
    B makeB() {
        return new B() {};
    }
}

public class MultiInterfaces {
    static void takeA(A a) {}
    static void takeB(B b) {}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takeA(x);
        takeA(y);
        takeB(x);
        takeB(y.makeB());
    }
}
