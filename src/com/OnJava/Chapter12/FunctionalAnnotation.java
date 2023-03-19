package com.OnJava.Chapter12;

@FunctionalInterface
interface Functional {
    String goodbye(String arg);
}

interface FunctionalNoAnn {
    String goodbye(String arg);
}

//@FunctionalInterface
interface NotFunctional {
    String goodbye(String arg);
    String hello(String arg);
}

public class FunctionalAnnotation {
    public String goodbye(String arg) {
        return "GoodBye, " + arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::goodbye;
        FunctionalNoAnn fnn = fa::goodbye;

        Functional fl = a -> "GoodBye, " + a;
        FunctionalNoAnn fln = a -> "GoodBye, " + a;
    }
}
