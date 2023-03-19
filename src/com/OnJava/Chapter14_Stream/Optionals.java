package com.OnJava.Chapter14_Stream;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Optionals {
    static void basics(Optional<String> opt) {
        if (opt.isPresent())
            System.out.println(opt.get());
        else
            System.out.println("Nothing Inside!");
    }

    static void ifPresent(Optional<String> opt) {
        opt.ifPresent(System.out::println);
    }

    static void orElse(Optional<String> opt) {
        System.out.println(opt.orElse("Nada"));
    }

    static void orElseGet(Optional<String> opt) {
        System.out.println(opt.orElseGet(() -> "Generated"));
    }

    static void orElseThrow(Optional<String> opt) {
        try {
            opt.orElseThrow(() -> new Exception("Supplied!"));
        } catch (Exception e) {
            System.out.println("Caught" + e);
        }
    }

    static void test(String testName, Consumer<Optional<String>> cos) {
        System.out.println("===" + testName + "===");
        cos.accept(Stream.of("Epithets").findFirst());
        cos.accept(Stream.<String> empty().findFirst());
    }

    public static void main(String[] args) {
        test("basics", Optionals::basics);
        test("ifPresent", Optionals::ifPresent);
        test("orElse", Optionals::orElse);
        test("orElseGet", Optionals::orElseGet);
        test("orElseThrow", Optionals::orElseThrow);
    }
}
