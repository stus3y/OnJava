package com.OnJava.Chapter5;

import static com.OnJava.Chapter5.Range.*;

public class ForInInt {
    public static void main(String[] args) {
        for (int i : range(1, 9, 4))
            System.out.println(i);

        for (int i : range(10, 5, -2))
            System.out.println(i);

        for (int i : range(5, 20, 3))
            System.out.println(i);
    }
}
