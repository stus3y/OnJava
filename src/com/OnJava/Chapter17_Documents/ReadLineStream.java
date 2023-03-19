package com.OnJava.Chapter17_Documents;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadLineStream {
    public static void main(String[] args) throws Exception {
        Files.lines(Paths.get("PathInfo.java"))
                .skip(13)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
