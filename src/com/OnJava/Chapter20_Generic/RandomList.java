package com.OnJava.Chapter20_Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomList<T> extends ArrayList<T> {
    private Random rand = new Random(47);

    // 随机获取一位
    public T select() {
        return get(rand.nextInt(size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();

        // 填充rs
        Arrays.stream("We are the champion!".split( " "))
                .forEach(rs::add);

        // 重复循环
        IntStream.range(0, 11).forEach(i ->
                System.out.print(rs.select() + " "));
    }
}
