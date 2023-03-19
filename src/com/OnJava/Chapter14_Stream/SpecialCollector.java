package com.OnJava.Chapter14_Stream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SpecialCollector {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = FileToWords.stream("/Users/stus3y/www/OnJava/src/com/OnJava/Chapter14_Stream/Cheese.dat")
                .collect(ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll);
        words.stream()
                .filter(s -> s.equals("cheese"))
                .forEach(System.out::println);
    }
}
