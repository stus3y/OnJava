package com.OnJava.Chapter10.interfaces.interfaceprocessor;

public class Applicator {
    public static void apply(Processor p, Object o) {
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(o));
    }
}
