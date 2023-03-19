package com.OnJava.Chapter9.polymorphism;

import com.OnJava.Chapter8.Cartoon;

class Characteristic {
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("disposing Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
    protected void dispose() {
        System.out.println("disposing Description " + s);
    }
}

class LivingCreature {
    private Characteristic p = new Characteristic("is alive");
    private Description d = new Description("Basic Living Creature");

    public LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("LivingCreature dispose");
        p.dispose();
        d.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic c = new Characteristic("has heart");
    private Description d = new Description("Animal not Vegetable");

    public Animal() {
        System.out.println("Animal()");
    }

    @Override protected void dispose() {
        System.out.println("Animal dispose");
        c.dispose();
        d.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description d = new Description("Both water and land");

    public Amphibian() {
        System.out.println("Amphibian");
    }

    @Override protected void dispose() {
        System.out.println("Amphibian dispose");
        p.dispose();
        d.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian{
    private Characteristic c = new Characteristic("Croaks");
    private Description d = new Description("Eats Bugs");

    public Frog() {
        System.out.println("Frog()");
    }

    @Override protected void dispose() {
        System.out.println("Frog dispose");
        c.dispose();
        d.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye!");
        frog.dispose();
    }
}
