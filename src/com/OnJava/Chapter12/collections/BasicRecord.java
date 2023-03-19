package com.OnJava.Chapter12.collections;

import java.util.Map;

interface Star {
    double brightness();
    double density();
}

record Employee (String name, int id) {}

record FinalFields(int i) {
    int times() {
        return i * 10;
    }
}

record Company (Employee employee) {}

record RedDwarf(double brightness) implements Star {
    @Override
    public double density() {
        return 100.0;
    }
}

record Point(int x, int y) {
    Point {
        assertPositive(x);
        assertPositive(y);
    }

    void assertPositive(int val) {
        if (val < 0)
            throw new IllegalArgumentException("negative");
    }
}

record PlusTen(int x) {
    PlusTen {
        x += 10;
    }

    public static void main(String[] args) {
        System.out.println(new PlusTen(10));
    }
}

public class BasicRecord {
    public static void main(String[] args) {
        var emp1 = new Employee("Bob", 11);
        var emp2 = new Employee("Doro", 9);
        System.out.println(emp1.name());
        System.out.println(emp1.id());
        System.out.println(emp1);
        var map = Map.of(emp1, "A", emp2, "B");
        System.out.println(map);
    }
}
