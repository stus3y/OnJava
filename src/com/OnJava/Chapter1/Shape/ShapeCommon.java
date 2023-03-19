package com.OnJava.Chapter1.Shape;

public class ShapeCommon implements Shape{
    @Override
    public void erase() {
        System.out.println(this.getClass() + " erase");
    }

    @Override
    public void draw() {
        System.out.println(this.getClass() + " draw");
    }
}
