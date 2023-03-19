package com.OnJava.Chapter19_Reflection;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        intClass = double.class;
        Class<Integer> genericClass = int.class;
//        genericClass = double.class;

//        Class<Number> genericClass2 = Integer.class;
        Class<? extends Number> genericClass2 = Integer.class;

        Class<?> genericClass3 = int.class;
        intClass = double.class;

    }
}
