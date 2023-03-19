package com.OnJava.Chapter10.interfaces;

interface Bob1 {
    default void bob() {
        System.out.println("Bob");
    }
}

interface Bob2 {
    default void bob() {
        System.out.println("Bob2");
    }
}

interface Bob3 {
    default void bob(String s) {
        System.out.println("Bob 3 " + s);
    }
}

/**
 * 参数类型相同  必须@Override 否则会报错
 */
public class SameInterface implements Bob1, Bob2 {
    @Override
    public void bob() {
        Bob1.super.bob();
    }
}

/**
 * 参数类型不同的默认方法接口可以直接使用
 */
class DiffInterface implements Bob2, Bob3 {
    public static void main(String[] args) {
        DiffInterface diffInterface = new DiffInterface();
        diffInterface.bob();
        diffInterface.bob("diff");
    }
}

