package com.OnJava.Chapter10.interfaces;

class Heat implements Operation {
    @Override
    public void execute() {
        Operation.show("Heat");
    }
}

public class MetalWork {
    public static void main(String[] args) {
        Operation twist = new Operation() {
            @Override
            public void execute() {
                Operation.show("Twist");
            }
        };
        Operation.runOps(
            new Heat(),                    // 常规类
            new Operation() {                    // 匿名类
                @Override
                public void execute() {
                    Operation.show("Hammer");
                }
            },
            twist::execute,                      // 方法引用
            () -> Operation.show("Anneal")  // Lambda
        );
    }
}
