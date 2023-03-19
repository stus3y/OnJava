package com.OnJava.Chapter19_Reflection;

class Cookie {
    static {
        System.out.println("Loading Cookie...");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum...");
    }
}

class Candy {
    static {
        System.out.println("Loading Candy...");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("Inner class");
        new Candy();
        System.out.println("After Creating Candy");
        try {
            Class.forName("com.OnJava.Chapter19_Reflection.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After Creating Cookie");
    }
}
