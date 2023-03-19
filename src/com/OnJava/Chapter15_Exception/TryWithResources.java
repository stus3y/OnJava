package com.OnJava.Chapter15_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
    public static void main(String[] args) {
        // try-with-resources
        try (
            InputStream in = new FileInputStream(new File("src/com/OnJava/Chapter15_Exception/TryWithResources.java"))
        ) {
            int contents = in.read();
        } catch (IOException e) {

        }
    }
}
