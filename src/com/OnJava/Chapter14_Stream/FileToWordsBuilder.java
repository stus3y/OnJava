package com.OnJava.Chapter14_Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    Stream<String> stream() {
        return builder.build();
    }

    public FileToWordsBuilder(String filePath) throws IOException {
        Files.lines(Paths.get(filePath))
            .skip(0)
            .forEach(line -> {
                for (String w : line.split("[ .?,]+")) {
                    builder.add(w);
                }
            });
    }

    public static void main(String[] args) throws IOException {
        new FileToWordsBuilder("./src/com/OnJava/Chapter14/Cheese.dat")
                .stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
