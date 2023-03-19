package com.OnJava.Chapter9.polymorphism;

class Shared {
    /**
     * 引用计数 refcount
     */
    private int refcount = 0;

    /**
     * 静态 counter 确保唯一性
     */
    private static long counter = 0;

    /**
     * 初始化不更改其id
     */
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    /**
     * 增加引用计数
     */
    public void addRef() {
        refcount ++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        System.out.println(shared);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();

        Composing[] composings = {
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared)
        };

        for (Composing composing : composings) {
            composing.dispose();
        }
    }
}
