package com.OnJava.Chapter9.polymorphism;

class Super {
    public int field = 0;
    public String type = "father";
    public int getField() { return field; }
}

class Sub extends Super {
    public int field = 1;
    @Override public int getField() { return field; }
    public int getSuperField() { return super.field; }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sub = new Sub();
        System.out.println(
                "getField: " + sub.getField() +
                " field: " + sub.field);

        Sub sub2 = new Sub();
        System.out.println(
                "getField: " + sub2.getField() +
                " field: " + sub2.field +
                " superField: " + sub2.getSuperField());
    }
}
