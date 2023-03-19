package com.OnJava.Chapter8.Reuse;

class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind wind = new Wind();
        // 向上转型 upcasting
        Instrument.tune(wind);
    }
}
