package com.OnJava.Chapter10.interfaces;

sealed class Color permits Red, Blue, Green {}

final class Red extends Color {}
final class Blue extends Color {}
final class Green extends Color {}

public class PermittedSubClasses {
    public static void main(String[] args) {
        for (var p : Color.class.getPermittedSubclasses()) {
            System.out.println(p.getSimpleName());
        }
    }
}
