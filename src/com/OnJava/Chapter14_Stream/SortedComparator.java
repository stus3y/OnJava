package com.OnJava.Chapter14_Stream;

import java.io.IOException;
import java.util.Comparator;

public class SortedComparator {
    public static void main(String[] args) throws IOException {
        FileToWords.stream("./src/com/OnJava/Chapter14/Cheese.dat")
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
