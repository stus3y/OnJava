package com.OnJava.Chapter9.shape;

public class Shapes {
    public static void main(String[] args) {
        RandomShapes shapes = new RandomShapes();
        for (Shape shape : shapes.array(10)) {
            shape.draw();
        }
    }
}
