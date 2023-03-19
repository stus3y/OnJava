package com.OnJava.Chapter4;

public class Literal {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1 = " + Integer.toBinaryString(i1));

        int i2 = 0X2f;
        System.out.println("i2 = " + Integer.toBinaryString(i2));

        int i3 = 0177;
        System.out.println("i3 = " + Integer.toBinaryString(i3));

        char c = 0xffff;
        System.out.println("c : " + Integer.toBinaryString(c));

        byte d = 0x7f;
        System.out.println("e : " + Integer.toBinaryString(d));

        short s = 0x7fff;
        System.out.println("s : " + Integer.toBinaryString(s));

        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;

        byte blb = 0b00110101;
        System.out.println("blb : " + Integer.toBinaryString(blb));

    }
}
