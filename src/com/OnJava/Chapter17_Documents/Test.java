package com.OnJava.Chapter17_Documents;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        System.out.println(Paths.get("").toAbsolutePath().toString());
    }
}
