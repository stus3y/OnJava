package com.OnJava.Chapter14_Stream;

import java.util.stream.Stream;

/**
 * 不同的输入输出类型
 */
class Numbered {
    final int n;

    public Numbered(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Numbered("
                 + n +
                ')';
    }
}

public class FunctionMap2 {
    public static void main(String[] args) {
        Stream.of(1, 5, 7, 9, 11, 13)
                .map(Numbered::new)
                .forEach(System.out::println);
    }
}
