package com.OnJava.Chapter18_String;

public class Immutable {
    public static String upCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String str = new String("Hello");
        System.out.println(str);
        String str2 = upCase(str);
        System.out.println(str2);
        System.out.println(str);
    }
}
