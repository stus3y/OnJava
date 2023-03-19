package com.OnJava.Chapter19_Reflection;

interface Interface {
    void doSomething();
    void doSomething(String arg);
}

class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void doSomething(String arg) {
        System.out.println("doSomething " + arg);
    }
}

class SimpleProxy implements Interface {
    private final Interface proxy;

    public SimpleProxy(Interface in) {
        this.proxy = in;
    }

    @Override
    public void doSomething() {
        System.out.println("Simple doSomething");
        proxy.doSomething();
    }

    @Override
    public void doSomething(String arg) {
        System.out.println("Simple doSomething " + arg);
        proxy.doSomething(arg);
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface in) {
        in.doSomething();
        in.doSomething("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println("*********************");
        consumer(new SimpleProxy(new RealObject()));
    }
}
