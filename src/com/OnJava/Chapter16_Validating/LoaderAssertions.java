package com.OnJava.Chapter16_Validating;

public class LoaderAssertions {
    public static void main(String[] args) {
        // 开启所有类断言状态
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
        new Loaded().go();
    }
}

class Loaded {
    public void go() {
        assert false: "Loaded.go()";
    }
}
