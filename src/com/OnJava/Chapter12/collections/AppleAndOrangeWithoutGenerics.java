package com.OnJava.Chapter12.collections;

import java.util.ArrayList;

public class AppleAndOrangeWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList(); // 默认为 Object 可以 add 任何对象
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (Object apple : apples) {
            ((Apple) apple).id();   // 只有 Apple 有 id() 方法  这里需要强转
            // Orange 只有在运行时才会被检测出来
        }
    }
}
