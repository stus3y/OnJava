package com.OnJava.Chapter8;

class Soup {
    private String s;
    public Soup() {
        System.out.println("Soup Constructor");
        s = "Constructor";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Bath {
    private String
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soup soup;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Bath Constructor");
        s3 = "Joy";
        toy = 3.14f;
        soup = new Soup();
    }

    {
        i = 47;
    }

    @Override
    public String toString() {
        // 延迟加载
        if (s4 == null)
            s4 = "Joy";
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", soup=" + soup +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        System.out.println(bath);
    }
}
