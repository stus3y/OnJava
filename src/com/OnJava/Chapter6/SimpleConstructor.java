package com.OnJava.Chapter6;

class Rock {
    public Rock() {
        System.out.println("Rock");
    }

    public Rock(int i) {
        System.out.println("Rock" + i);
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
            new Rock(i);
        }
    }
}

