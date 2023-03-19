package com.OnJava.Chapter20_Generic;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<>(a);
        set.addAll(b);
        return set;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<>(a);
        set.retainAll(b);
        return set;
    }

    public static <T> Set<T> difference(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<>(a);
        set.removeAll(b);
        return set;
    }

    // 所有不在交集里的元素
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
