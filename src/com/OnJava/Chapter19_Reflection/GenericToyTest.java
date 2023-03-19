package com.OnJava.Chapter19_Reflection;

import java.lang.reflect.InvocationTargetException;

public class GenericToyTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<FancyToy> fc = FancyToy.class;
        FancyToy fancyToy = fc.getConstructor().newInstance();
        Class<? super FancyToy> up = fc.getSuperclass();

        // 无法使用
//        Class<Toy> up2 = fc.getSuperclass();

        Object obj = fc.getSuperclass();
    }
}
