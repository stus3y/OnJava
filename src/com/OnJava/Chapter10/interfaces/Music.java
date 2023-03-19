package com.OnJava.Chapter10.interfaces;

import com.OnJava.Chapter9.music.Note;

interface Instrument {
    int VALUE = 5;

    default void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    default void adjust() {
        System.out.println("Adjusting " + this);
    }
}

class Wind implements Instrument {
    @Override public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {
    @Override public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {
    @Override public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class WoodWind extends Wind {
    @Override
    public String toString() {
        return "WoodWind";
    }
}

public class Music {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument instrument : e) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument[] e = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind(),
        };
        tuneAll(e);
    }
}
