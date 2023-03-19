package com.OnJava.Chapter4;

class Letter {
    char c;
}
public class PassObject {
    static void f (Letter letter) {
        letter.c = 'z';
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.c = 'a';
        System.out.println("1: letter.c = " + letter.c);

        letter.c += 1;
        System.out.println("2: letter.c = " + letter.c);

        f(letter);
        System.out.println("3: letter.c = " + letter.c);
    }
}
