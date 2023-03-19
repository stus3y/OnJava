package com.OnJava.Chapter8;

class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSourceConstructor");
        s = "Constructor";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String val1, val2, val3, val4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "val1='" + val1 + '\'' +
                ", val2='" + val2 + '\'' +
                ", val3='" + val3 + '\'' +
                ", val4='" + val4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}
