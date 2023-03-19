package com.OnJava.Chapter17_Documents;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Directories {
    static Path test = Paths.get("test");
    static String sep = FileSystems.getDefault().getSeparator();
    static List<String> parts = Arrays.asList("foo", "bar", "baz", "bag");

    static Path makeVariant() {
        Collections.rotate(parts, 1);
        return Paths.get("test", String.join(sep, parts));
    }

    static void refreshDir() throws IOException {
        if (Files.exists(test))
            RmDir.rmdir(test);
        if (!Files.exists(test))
            Files.createDirectory(test);
    }

    static void populateTestDir() throws IOException {
        for (int i = 0; i < parts.size(); i++) {
            Path variant = makeVariant();
            if(!Files.exists(variant)) {
                Files.createDirectories(variant);
                // 拷贝
                Files.copy(Paths.get("Directories.java"), variant.resolve("File.txt"));
                Files.createTempFile(variant, null, null);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        refreshDir();
        Files.createFile(test.resolve("Hello.txt"));

        try {
            Files.createDirectory(makeVariant());
        } catch (Exception e) {
            System.out.println("Nope, that doesn't work");
        }

        populateTestDir();

        Path tempDir = Files.createTempDirectory(test, "DIR_");
        Files.createTempFile(test, "test-", ".java");
        Path tempDir2 = Files.createTempDirectory(test, "DIR_");
        Files.createTempFile(tempDir, "pre", ".non");
        Files.newDirectoryStream(test)
                .forEach(System.out::println);
        System.out.println("****************");
        Files.walk(test).forEach(System.out::println);
    }

    public static void refreshTestDir() {
    }
}
