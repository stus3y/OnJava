package com.OnJava.Chapter9.music;

public class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play()");
    }

    String what() { return "Instrument"; }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
