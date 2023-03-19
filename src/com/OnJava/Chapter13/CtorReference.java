package com.OnJava.Chapter13;

class Dog {
    String name;
    int age = -1;
    Dog() { name = "stray"; }
    Dog(String name) { this.name = name;}
    Dog(String name, int age) { this.name = name; this.age = age; }
}

interface MakeNoArgs {
    Dog make();
}

interface Make1Arg {
    Dog make(String name);
}

interface Make2Args {
    Dog make(String name, int age);
}

/**
 * 构造器方法引用
 */
public class CtorReference {
    public static void main(String[] args) {
        MakeNoArgs makeNoArgs = Dog::new;
        Make1Arg make1Arg =  Dog::new;
        Make2Args make2Args =  Dog::new;

        makeNoArgs.make();
        make1Arg.make("Tom");
        make2Args.make("Tom", 3);
    }
}
