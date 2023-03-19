package com.OnJava.Chapter6;

class Plumbus {}

public class TypeInference {
    void method() {
        String hello1 = "Hello";
        var hello = "Hello!";
        Plumbus plumbus = new Plumbus();
        var plumbus2 = new Plumbus();
    }

    static void staticMethod() {
        var hello = "Hello!";
        var pb2 = new Plumbus();
    }
}

class NoInference {
    String field1 = "Field initialization";
//    var filed2 = "Can't do this";
}
