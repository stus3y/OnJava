package com.OnJava.Chapter15_Exception;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainException {
    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("src/com/OnJava/Chapter15_Exception/MainException.java"));
    }
}
