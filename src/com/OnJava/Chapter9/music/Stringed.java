package com.OnJava.Chapter9.music;

public class Stringed extends Instrument{
    @Override
    public void play (Note note) {
        System.out.println("Stringed.play() " + note);
    }
}
