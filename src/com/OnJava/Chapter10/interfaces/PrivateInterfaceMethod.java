package com.OnJava.Chapter10.interfaces;

interface Old {
    default void fd() {
        System.out.println("Old::fd()");
    }
    static void fs() {
        System.out.println("Old::fs()");
    }
    default void f() {
        fd();
    }
    static void g() {
        fs();
    }
}

class ImplOld implements Old {}

interface JDK9 {
    private void fd() {
        System.out.println("JDK9::fd()");
    }
    private static void fs() {
        System.out.println("JDK9::fs()");
    }
    default void f() {
        fd();
    }
    static void g() {
        fs();
    }
}

class JDK9Impl implements JDK9 {}

public class PrivateInterfaceMethod {
    public static void main(String[] args) {
        new ImplOld().f();
        Old.g();
        new JDK9Impl().f();
        JDK9.g();
    }
}
