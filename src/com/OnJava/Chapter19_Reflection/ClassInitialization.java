package com.OnJava.Chapter19_Reflection;

import java.util.Random;

class Initable {
    static final int STATIC_FINAL = 47;
    static final int STATIC_FINAL2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        // .class 并不会触发初始化
        Class<Initable>  init = Initable.class;

        // Class.forName 会触发初始化
//        Class<?> aClass = Class.forName("com.OnJava.Chapter19_Reflection.Initable");

        System.out.println("After creating Initable class");

        System.out.println(Initable.STATIC_FINAL);
        System.out.println("After init STATIC_FINAL");

        System.out.println(Initable.STATIC_FINAL2);
        System.out.println("After init STATIC_FINAL2");

        System.out.println(Initable2.staticNonFinal);
        Class<?> initable3 = Class.forName("com.OnJava.Chapter19_Reflection.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
