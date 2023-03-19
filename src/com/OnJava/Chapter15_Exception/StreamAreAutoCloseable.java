package com.OnJava.Chapter15_Exception;

import com.OnJava.Chapter6.PassingThis;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamAreAutoCloseable {
    public static void main(String[] args) throws IOException {
        try (
            Stream<String> in = Files.lines(Paths.get("src/com/OnJava/Chapter15_Exception/StreamAreAutoCloseable.java"));
            PrintWriter outfile = new PrintWriter("src/com/OnJava/Chapter15_Exception/Result.txt");
        ) {
            in.skip(5)
                    .limit(1)
                    .map(String::toLowerCase)
                    .forEachOrdered(outfile::println);
        }
    }
}
