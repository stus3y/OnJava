package com.OnJava.Chapter15_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EffectivelyFinalTWR {
    static void old() {
        try (
            InputStream in1 = new FileInputStream(new File("src/com/OnJava/Chapter15_Exception/EffectivelyFinalTWR.java"));
            InputStream in2 = new FileInputStream(new File("src/com/OnJava/Chapter15_Exception/EffectivelyFinalTWR.java"));
        ) {
            in1.read();
            in2.read();
        } catch (IOException e) {

        }
    }

    static void jdk9() throws IOException {
        InputStream in1 = new FileInputStream(new File("src/com/OnJava/Chapter15_Exception/EffectivelyFinalTWR.java"));
        InputStream in2 = new FileInputStream(new File("src/com/OnJava/Chapter15_Exception/EffectivelyFinalTWR.java"));
        try (in1; in2) {
            in1.read();
            in2.read();
        }

        in1.read();
        in2.read();
    }

    public static void main(String[] args) {
        old();
        try {
            jdk9();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
