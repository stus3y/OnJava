package com.OnJava.Chapter10.interfaces;

sealed interface II permits JJ {}

final class JJ implements II {}
class Something {}

public class CheckDownCast {
    public static void main(String[] args) {
        II i = new JJ();
        JJ j = (JJ) i;
    }
}
