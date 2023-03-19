package com.OnJava.Chapter10.interfaces.interfaceprocessor;

import com.OnJava.Chapter10.interfaces.filters.*;

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        Applicator.apply(new FilterAdapter(new LowPass(1.0)), waveform);
        Applicator.apply(new FilterAdapter(new HighPass(2.0)), waveform);
        Applicator.apply(new FilterAdapter(new BandPass(3.0, 4.0)), waveform);
    }
}
