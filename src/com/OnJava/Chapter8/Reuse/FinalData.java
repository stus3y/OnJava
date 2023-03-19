package com.OnJava.Chapter8.Reuse;

import java.util.Random;

class Value {
    int i;
    Value(int i) { this.i = i; }

    @Override
    public String toString() {
        return i + "";
    }
}

public class FinalData {
    private static Random random = new Random(47);
    private String id;
    FinalData(String id) { this.id = id; }

    // 可以是编译时常量
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    // 典型的公用常量
    public static final int VALUE_THREE = 39;

    // 不能作为编译时常量
    private final int i4 = random.nextInt(20);  // final 修饰对象 引用对象不变 但是对象的值发生了变化  & 不变 value 变

    private static int INT_5 = random.nextInt(20); // Class
    private static final int INT_6 = random.nextInt(20);


    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value v3 = new Value(33);

    // Array
    private final int[] a = { 1, 2, 3, 4, 5, 6 };

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5 + ", INT_6 = " + INT_6;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        fd1.v2.i ++;
        fd1.v1 = new Value(9);
        System.out.println(fd1.valueOne);
        System.out.println(FinalData.VALUE_TWO);
        System.out.println(FinalData.v3);

        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
        System.out.println(fd1);
        System.out.println(new FinalData("fd2"));
        System.out.println(new FinalData("fd3"));
        System.out.println(new FinalData("fd4"));
    }
}
