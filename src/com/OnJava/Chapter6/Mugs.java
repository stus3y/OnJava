package com.OnJava.Chapter6;

class Mug {
    public Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 && mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int marker) {
        System.out.println("Mugs(" + marker + ")");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Mugs mugs1 = new Mugs();
        System.out.println("mugs1 completed");
        Mugs mugs2 = new Mugs(2);
        System.out.println("mugs2 completed");
    }
}
