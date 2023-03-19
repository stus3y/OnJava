package com.OnJava.Chapter14_Stream;

import com.OnJava.Chapter10.interfaces.Operation;

import java.util.Arrays;

public class Machine2 {
    public static void main(String[] args) {
        Arrays.stream(new Operation[] {
            () -> Operation.show("Bing"),
            () -> Operation.show("Crack"),
            () -> Operation.show("Twist"),
            () -> Operation.show("Pop"),
        }).forEach(Operation::execute);
    }
}
