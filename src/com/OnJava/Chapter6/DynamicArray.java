package com.OnJava.Chapter6;

public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] { "field", "de", "dum"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg + "");
        }
    }
}
