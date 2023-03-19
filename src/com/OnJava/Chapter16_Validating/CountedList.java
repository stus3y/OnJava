package com.OnJava.Chapter16_Validating;

import java.util.ArrayList;

public class CountedList extends ArrayList<String> {
    private static int counter = 0;
    private int id = counter ++;
    public CountedList() {
        System.out.println("CountedList #" + id);
    }
    public int getId() { return id; }
}
