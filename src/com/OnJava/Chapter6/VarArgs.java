package com.OnJava.Chapter6;

class A {}

public class VarArgs {
    public static void main(String[] args) {
        printArray(new Object[] {
            47, (float) 3.14, 11.11
        });
        printArray(new Object[]{ "one", "two", "three"});
        printArray(new Object[]{ new A(), new A(), new A()});
    }

    static void printArray(Object[] args) {
        for (Object arg : args)
            System.out.print(arg + " ");
        System.out.println();
    }
}
