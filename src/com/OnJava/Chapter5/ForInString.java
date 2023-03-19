package com.OnJava.Chapter5;

public class ForInString {
    public static void main(String[] args) {
        for(char c : "Hello World !".toCharArray()) {
            if (Character.isLetter(c)) {
                System.out.print(c);
            }
        }
    }
}
