package com.OnJava.Chapter14_Stream;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Signal {
    private final String msg;
    public Signal(String msg) { this.msg = msg;}

    @Override
    public String toString() {
        return "Signal(" + msg + ")";
    }

    static Random rand = new Random(47);

    public static Signal morse() {
        return switch (rand.nextInt(4)) {
            case 1 -> new Signal("dot");
            case 2 -> new Signal("dash");
            default -> null;
        };
    }

    public static Stream<Optional<Signal>> stream() {
        return Stream.generate(Signal::morse)
                .map(signal -> Optional.ofNullable(signal));
    }
}
