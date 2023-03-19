package com.OnJava.Chapter10.interfaces;

abstract class AbstractAccess {
    private void m1() {}
    protected void m2() {}
    protected abstract void m2a();
    void m3() {}
    abstract void m3a();
    public void m4() {}
    public abstract void m4a();
    // private abstract void m5();  禁止使用 private abstract
}
