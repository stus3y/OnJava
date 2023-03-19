package com.OnJava.Chapter4;

public class Equivalence {
    static void show(String desc, Integer n1, Integer n2) {
        System.out.println(desc + ":");
        System.out.printf(
            "%d==%d %b %b%n", n1, n2, n1 == n2, n1.equals(n2)
        );
        System.out.println();
    }
    
    @SuppressWarnings("deprecation")
    public static void test(int value) {
        Integer i1 = value;
        Integer i2 = value;
        show("Automatic", i1, i2);
        
        Integer r1 = new Integer(value);
        Integer r2 = new Integer(value);
        show("new Integer()", r1, r2);

        Integer v1 = Integer.valueOf(value);
        Integer v2 = Integer.valueOf(value);
        show("Integer.valueOf()", v1, v2);

        int x = value;
        int y = value;
        show("int", x, y);
    }

    public static void main(String[] args) {
        test(127);
        test(128);
    }
}
