package com.OnJava.Chapter11.innerclasses;

/**
 * 迭代器
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}

/**
 * 保存一个对象序列
 */
public class Sequence {
    private Object[] items;
    private int next;

    /**
     * 初始化容器大小
     * @param size
     */
    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object o) {
        if (next < items.length)
            items[next++] = o;
    }

    public int size() {
        return items.length;
    }

    /**
     * 提供 Iterator 的 private 类
     */
    private class SequenceSelector implements Selector {
        /**
         * pointer => current
         */
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

        var selector = sequence.selector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
