package com.OnJava.Chapter11.innerclasses;

public class TestBed {
    public void f() {}
    static class Tester {
        public static void main(String[] args) {
            TestBed testBed = new TestBed();
            testBed.f();
        }
    }
}
