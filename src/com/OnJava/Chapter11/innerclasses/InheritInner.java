package com.OnJava.Chapter11.innerclasses;

class WithInner {
    class Inner{}
}

public class InheritInner extends WithInner.Inner{
    // 创建内部类构造器时，还需要使用innerClass.super() 调用父类初始化方法
    public InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();
        InheritInner inheritInner = new InheritInner(withInner);
    }
}
