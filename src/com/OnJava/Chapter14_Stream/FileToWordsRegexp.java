package com.OnJava.Chapter14_Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileToWordsRegexp {
    private String all;
    public FileToWordsRegexp(String filePath) throws IOException {
        all = Files.lines(Paths.get(filePath))
                .skip(0)
                .collect(Collectors.joining(" "));
    }

    public Stream<String> stream() {
        return Pattern.compile("[ .,?]+").splitAsStream(all);
    }

    public static void main(String[] args) throws IOException {
        FileToWordsRegexp fw = new FileToWordsRegexp("./src/com/OnJava/Chapter14/Cheese.dat");
        fw.stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);

        System.out.println();

        fw.stream()
                .skip(7)
                .limit(2)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
