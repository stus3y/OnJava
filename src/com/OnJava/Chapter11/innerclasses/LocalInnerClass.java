package com.OnJava.Chapter11.innerclasses;

interface Counter{
    int next();
}

public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        // 一个局部内部类
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count ++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {
            // 匿名内部类不能有具名的构造器
            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.print(name);
                return count ++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter local_inner = lic.getCounter("Local inner "),
                anonymous_inner = lic.getCounter2("Anonymous inner ");
        for (int i = 0; i < 5; i++) {
            System.out.println(local_inner.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(anonymous_inner.next());
        }
    }
}
