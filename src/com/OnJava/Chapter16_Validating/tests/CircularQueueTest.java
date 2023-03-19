package com.OnJava.Chapter16_Validating.tests;

import com.OnJava.Chapter16_Validating.CircularQueue;
import com.OnJava.Chapter16_Validating.CircularQueueException;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CircularQueueTest {
    private CircularQueue queue = new CircularQueue(10);
    private int i = 0;

    @BeforeEach
    public void initialize() {
        while (i < 5)
            queue.put(Integer.toString(i++));
    }

    // 支撑方法
    private void showFullness() {
        System.out.println("==============ShowFullness==============");
        assertTrue(queue.full());
        assertFalse(queue.empty());
        System.out.println(queue.dump());
    }

    private void showEmptiness() {
        System.out.println("==============ShowEmptiness==============");
        assertFalse(queue.full());
        assertTrue(queue.empty());
        System.out.println(queue.dump());
    }

    @Test
    public void full() {
        System.out.println("testFull");
        System.out.println(queue.dump());
        System.out.println(queue.get());
        System.out.println(queue.get());
        while (!queue.full())
            queue.put(Integer.toString(i++));
        String msg = "";
        try {
            queue.put("");
        } catch (CircularQueueException e) {
            msg = e.getMessage();
            System.out.println(msg);
        }

        assertEquals(msg, "put() into full CircularQueue");
        showFullness();
    }

    @Test
    public void empty() {
        System.out.println("testEmpty");
        while (!queue.empty())
            System.out.println(queue.get());
        String msg = "";
        try {
            queue.get();
        } catch (CircularQueueException e) {
            msg = e.getMessage();
            System.out.println(msg);
        }

        assertEquals(msg, "get() from empty CircularQueue");
        showEmptiness();
    }

    @Test
    public void nullPut() {
        System.out.println("testNullPut");
        String msg = "";
        try {
            queue.put(null);
        } catch (CircularQueueException e) {
            msg = e.getMessage();
            System.out.println(msg);
        }

        assertEquals(msg, "put() null item");
    }

    @Test
    public void circularity() {
        System.out.println("testCircularity");
        while (!queue.full())
            queue.put(Integer.toString(i++));
        showFullness();
        assertTrue(queue.isWrapped());
        while (!queue.empty())
            System.out.println(queue.get());
        showEmptiness();
        while (!queue.full())
            queue.put(Integer.toString(i++));
        showFullness();
        while (!queue.empty())
            System.out.println(queue.get());
        showEmptiness();
    }
}
