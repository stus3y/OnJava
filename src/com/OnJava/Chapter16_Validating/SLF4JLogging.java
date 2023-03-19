package com.OnJava.Chapter16_Validating;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JLogging {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SLF4JLogging.class);
        logger.info("Hello World");
    }
}
