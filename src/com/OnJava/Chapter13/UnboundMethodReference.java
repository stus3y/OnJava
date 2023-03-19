package com.OnJava.Chapter13;

class X {
    String f() { return "X::f()"; }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transformX(X x);
}

public class UnboundMethodReference {
    public static void main(String[] args) {
        X x = new X();
        MakeString ms = x::f;

        TransformX tx = X::f;
        System.out.println(tx.transformX(x));
        System.out.println(x.f());
    }
}
