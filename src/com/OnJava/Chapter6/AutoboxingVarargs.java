package com.OnJava.Chapter6;

public class AutoboxingVarargs {
    static void print(Integer... args) {
        for (Integer arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(1, 2);
        print(1, 2, 3, 4, 5);
        print(11, 15, 19);
    }
}
