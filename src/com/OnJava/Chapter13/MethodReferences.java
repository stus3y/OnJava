package com.OnJava.Chapter13;

interface Callable {
    void call(String s);
}

class Describe{
    void show(String msg) {
        System.out.println(msg);
    }
}

public class MethodReferences {
    static void hello(String name) {
        System.out.println("Hello " + name);
    }

    static class Description {
        String about;

        public Description(String about) {
            this.about = about;
        }

        void help(String msg) {
            System.out.println(about + " " + msg);
        }
    }

    static class Helper {
        static void assist(String msg) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Describe describe = new Describe();
        Callable c =  describe::show;  // 保证参数类型和返回类型一致
        c.call("call()");

        c = MethodReferences::hello;
        c.call("hello()");

        c = new Description("valuable")::help;
        c.call("help()");

        c = Helper::assist;
        c.call("assist()");
    }
}
