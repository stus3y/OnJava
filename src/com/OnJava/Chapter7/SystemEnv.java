package com.OnJava.Chapter7;

import java.awt.*;

public class SystemEnv {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("java.class.path"));
    }
}
