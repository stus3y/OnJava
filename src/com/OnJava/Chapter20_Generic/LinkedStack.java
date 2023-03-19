package com.OnJava.Chapter20_Generic;

public class LinkedStack<T> {
    private static class Node<N> {
        N item;
        Node<N> next;
        Node() { item = null; next = null; }
        Node(N item, Node<N> next) { this.item = item; this.next = next; }
        boolean end() { return item == null && next == null; }
    }

    private Node<T> top = new Node<>(); // 栈底哨兵

    public void push(T item) {
        top = new Node<>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end())
            top = top.next;

        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> ls = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" "))
            ls.push(s);

        String s;
        while ((s = ls.pop()) != null)
            System.out.println(s);
    }
}
