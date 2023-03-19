package com.OnJava.Chapter5;

public class ListCharacters {
    public static void main(String[] args) {
        for(char c = 0; c < 128; c ++) {
            if (Character.isUpperCase(c) || Character.isLowerCase(c) || Character.isDigit(c)) {
                System.out.println("value : " + (int)c + " character : " + c);
            }
        }
    }
}
