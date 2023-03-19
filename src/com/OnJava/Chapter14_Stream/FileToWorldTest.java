package com.OnJava.Chapter14_Stream;

import java.io.IOException;

public class FileToWorldTest {
    public static void main(String[] args) throws IOException {
        FileToWords.stream("/Users/stus3y/www/OnJava/src/com/OnJava/Chapter14/Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream("/Users/stus3y/www/OnJava/src/com/OnJava/Chapter14/Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }
}
