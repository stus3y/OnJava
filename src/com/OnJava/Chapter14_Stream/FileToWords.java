package com.OnJava.Chapter14_Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FileToWords {
    public static Stream<String> stream (String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .flatMap(line ->
                        // \\W+ 表示非单词字符
                        Pattern.compile("\\W+").splitAsStream(line));
    }
}
