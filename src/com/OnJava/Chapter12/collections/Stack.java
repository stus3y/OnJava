package com.OnJava.Chapter12.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack<T> {
    private Deque<T> storage = new ArrayDeque<>();
    public void push(T t) { storage.push(t); }
    public T peek() { return storage.peek(); }
    public T pop() { return storage.pop(); }
    public boolean isEmpty() { return storage.isEmpty(); }
    @Override public String toString() {
        return storage.toString();
    }
}
