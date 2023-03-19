package com.OnJava.Chapter7;

public class Sundae {
    /**
     *  单例模式
     */
    private Sundae() {}
    static Sundae makeASundae() {
        return new Sundae();
    }
}

class IceCream {
    public static void main(String[] args) {
        Sundae sundae = Sundae.makeASundae();
    }
}
