package com.OnJava.Chapter12.collections;

public class StackTest2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "The time is now".split(" ")) {
            stack.push(s);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
