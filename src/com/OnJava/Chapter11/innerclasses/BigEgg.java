package com.OnJava.Chapter11.innerclasses;

class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }
    Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}

public class BigEgg extends Egg{
    // 内部类没有重写
    public class Yolk {
        public Yolk() {
            System.out.println("Big.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
