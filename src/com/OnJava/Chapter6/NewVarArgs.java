package com.OnJava.Chapter6;

public class NewVarArgs {
    static void print(Object... args) {
        for (Object arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(47, (float) 3.14, 11.11);
        print("one", "two", "three");
        print();
    }
}
