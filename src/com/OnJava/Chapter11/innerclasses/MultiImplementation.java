package com.OnJava.Chapter11.innerclasses;

class ATest {}
abstract class BTest {}
class C extends ATest {
    BTest makeB () {
        return new BTest() {};
    }
}

public class MultiImplementation {
    static void takeA(ATest a) {}
    static void takeB(BTest b) {}

    public static void main(String[] args) {
        C c = new C();
        takeA(c);
        takeB(c.makeB());
    }
}
