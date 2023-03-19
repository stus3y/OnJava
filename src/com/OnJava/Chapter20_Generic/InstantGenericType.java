package com.OnJava.Chapter20_Generic;

import java.util.function.Supplier;

class ClassAsFactory<T> implements Supplier<T> {
    Class<T> type;

    public ClassAsFactory(Class<T> type) {
        this.type = type;
    }

    @Override
    public T get() {
        try {
            return type.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {
    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee";
    }
}

public class InstantGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println(fe.get());

        ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        try {
            fi.get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}