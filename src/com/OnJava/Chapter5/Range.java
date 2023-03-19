package com.OnJava.Chapter5;

public class Range {
    public static int[] range(int start, int end, int step) {
        if(step == 0)
            throw new IllegalArgumentException("step can't be zero");

        int len = Math.max(0, (end + (step > 0 ? -1 : 1) - start) / step + 1);

        System.out.println("len: " + len);
        int[] result = new int[len];
        for (int i = 0; i < len; i ++) {
            result[i] = start + i * step;
        }

        return result;
    }

    public static int[] range(int start, int end) {
        return range(start, end, 1);
    }

    public static int[] range(int end) {
        return range(0, end);
    }
}
