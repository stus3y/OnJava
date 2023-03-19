package com.OnJava.Chapter1.Shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        doSomething(circle);
        doSomething(triangle);
    }

    static void doSomething(Shape shape) {
        shape.draw();
        shape.erase();
    }
}
