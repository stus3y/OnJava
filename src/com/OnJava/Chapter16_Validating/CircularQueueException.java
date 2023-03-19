package com.OnJava.Chapter16_Validating;

public class CircularQueueException extends RuntimeException{
    public CircularQueueException(String message) {
        super(message);
    }
}
