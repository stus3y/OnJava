package com.OnJava.Chapter9.polymorphism;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("Before draw()");
        /**
         * 构造函数中尽量避免方法重写
         * 否则会带来不必要的错误和麻烦
         */
        draw();
        System.out.println("After draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
