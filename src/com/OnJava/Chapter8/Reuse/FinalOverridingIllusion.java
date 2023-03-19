package com.OnJava.Chapter8.Reuse;

class WithFinals {
    private void f() {
        System.out.println("WithFinals.f()");
    }

    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverwritingWithFinals {
    private final void f() {
        System.out.println("OverwritingWithFinals.f()");
    }


}

public class FinalOverridingIllusion {
    public static void main(String[] args) {

    }
}
