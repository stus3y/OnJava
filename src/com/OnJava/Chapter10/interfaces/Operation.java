package com.OnJava.Chapter10.interfaces;

/**
 * 模板方法
 */
public interface Operation {
    void execute();

    static void runOps(Operation ...args) {
        for (Operation arg : args) {
            arg.execute();
        }
    }

    static void show(String msg) {
        System.out.println(msg);
    }
}
