package com.OnJava.Chapter13;

import java.util.function.Function;

class I {
    @Override public String toString() { return "I"; }
}

class O {
    @Override public String toString() { return "O"; }
}

public class TransformFunction {
    static Function<I, O> transform(Function<I, O> args) {
        return args.andThen(o -> {
            System.out.println(o);
            return o;
        });
    }

    public static void main(String[] args) {
        Function<I, O> transform = transform(i -> {
            System.out.println(i);
            return new O();
        });
        O o = transform.apply(new I());
    }
}
