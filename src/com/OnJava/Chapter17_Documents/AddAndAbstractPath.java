package com.OnJava.Chapter17_Documents;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddAndAbstractPath {
    static Path base = Paths.get("..", "..", "..").toAbsolutePath().normalize();

    static void show(int id, Path result) {
        if (result.isAbsolute())
            System.out.println("(" + id + ")r " + base.relativize(result));
        else
            System.out.println("(" + id + ") " + result);
        try {
            System.out.println("RealPath: " + result.toRealPath());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("os.name"));
        System.out.println(base);
        File file = new File("1.txt");
        Path p = Paths.get("").toAbsolutePath();
        show(1, p);
    }
}
