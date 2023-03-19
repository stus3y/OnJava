package com.OnJava.Chapter19_Reflection;


interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    public Toy() {}
    public Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    public FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: 【" + cc.getName() + "】 is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
        System.out.println("********************************************************");
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.OnJava.Chapter19_Reflection.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyTest");
            System.exit(1);
        }

        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Cannot instantiate");
        }

        printInfo(obj.getClass());
    }
}
