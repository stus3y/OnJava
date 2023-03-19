package com.OnJava.Chapter4;

class A {
    int i;
}

class B {
    int i ;

    @Override
    public boolean equals(Object obj) {
        B b = (B) obj;
        return i == b.i;
    }
}

public class EqualMethod {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.i = a2.i = 100;
        System.out.println(a1.equals(a2));

        B b1 = new B();
        B b2 = new B();
        b1.i = b2.i = 128;
        System.out.println(b1.equals(b2));
    }
}
