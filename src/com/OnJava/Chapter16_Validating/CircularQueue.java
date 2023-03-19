package com.OnJava.Chapter16_Validating;

import java.util.Arrays;

public class CircularQueue {
    private Object[] data; // 存储数据的数组
    private int in  = 0, // 下一个可储存的空间
                out = 0; // 下一个可获取的对象

    private boolean wrapped = false; // 是否已经循环到了队列的开头

    /**
     * 初始化
     *
     * @param size
     */
    public CircularQueue(int size) {
        data = new Object[size];
        assert invariant();
    }

    public boolean empty() {
        return !wrapped && in == out;
    }

    public boolean full() {
        return wrapped && in == out;
    }

    public boolean isWrapped() {
        return wrapped;
    }

    public void put(Object item) {
        precondition(item != null, "put() null item");
        precondition(!full(), "put() into full CircularQueue");
        assert invariant();
        data[in++] = item;
        if (in >= data.length) {
            in = 0;
            wrapped = true;
        }
        assert invariant();
    }

    public Object get() {
        precondition(!empty(), "get() from empty CircularQueue");
        assert invariant();
        Object returnVal = data[out];
        data[out] = null;
        out ++;
        if (out >= data.length) {
            out = 0;
            wrapped = false;
        }
        assert postcondition(returnVal != null, "Null item in CircularQueue");
        assert invariant();
        return returnVal;

    }

    private static void precondition(boolean cond, String msg) {
        if(!cond) throw new CircularQueueException(msg);
    }


    private static boolean postcondition(boolean cond, String msg) {
        if(!cond) throw new CircularQueueException(msg);
        return true;
    }

    private boolean invariant() {
        // 保证在保存了对象的data区域不会有空值
        for(int i = out; i != in; i = (i + 1) % data.length)
            if (data[i] == null)
                throw new CircularQueueException("null in CircularQueueException");


        if (full()) return true;
        // 保证在保存了对象的data区域之外只会有空值
        for (int i = in; i != out; i = (i + 1) % data.length)
            if (data[i] != null)
                throw new CircularQueueException("non-null outside of CircularQueue range: " + dump());


        return true;
    }

    public String dump() {
        return "in = " + in +
                ", out = " + out +
                ", full() = " + full() +
                ", empty() = " + empty() +
                ", CircularQueue = " + Arrays.asList(data);
    }
}
