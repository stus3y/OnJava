package com.OnJava.Chapter11.innerclasses;

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        /**
         * 内部类获取外部类
         * @return
         */
        public DotThis outer() {
            return DotThis.this;
        }
    }

    /**
     * 外部类获取内部类
     * @return
     */
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        var dotThis = new DotThis();
        var inner = dotThis.inner();
        inner.outer().f();
    }
}
