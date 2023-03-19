package com.OnJava.Chapter8.Reuse;

class Gizmo {
    public void spin() {}
}

public class FinalArguments {
    void with(final Gizmo o) {
    }

    void without(Gizmo o) {
        o  = new Gizmo();
        o.spin();
    }

    int g(final int i) { return i + 1; } // 可进行读操作

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
