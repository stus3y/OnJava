package com.OnJava.Chapter9.music;

public class Brass extends Instrument{
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }
}
