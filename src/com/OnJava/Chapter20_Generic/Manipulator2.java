package com.OnJava.Chapter20_Generic;

public class Manipulator2<T extends HasF> {
    private T obj;

    public Manipulator2(T obj) {
        this.obj = obj;
    }

    // 有了边界 以下代码就可以编译了
    public void manipulate() {
        obj.f();
    }
}
