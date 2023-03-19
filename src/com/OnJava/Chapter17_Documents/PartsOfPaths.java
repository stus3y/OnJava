package com.OnJava.Chapter17_Documents;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PartsOfPaths {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        Path p = Paths.get("PartOfPaths.java").toAbsolutePath();
        System.out.println(p);
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(p.getName(i));
        }

        System.out.println("end with '.java': " + p.endsWith(".java"));
        for (Path path : p) {
            System.out.print(path + ": ");
            System.out.print(p.startsWith(path) + " : ");
            System.out.println(p.endsWith(path));
        }

        System.out.println("Starts with " + p.getRoot() + " " + p.startsWith(p.getRoot()));
    }
}
