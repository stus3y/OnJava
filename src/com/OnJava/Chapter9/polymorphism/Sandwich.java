package com.OnJava.Chapter9.polymorphism;

class Meal {
    public Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    public Bread() {
        System.out.println("Bread()");
    }
}

class Chess {
    public Chess() {
        System.out.println("Chess()");
    }
}

class Lettuce {
    public Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    public Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    public PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Chess c = new Chess();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
