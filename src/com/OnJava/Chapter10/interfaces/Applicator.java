package com.OnJava.Chapter10.interfaces;

import java.util.Arrays;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}

class UpCase extends Processor {
    /**
     * 协变返回
     *
     * @param input
     * @return
     */
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class DownCase extends Processor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Applicator {
    public static void apply(Processor p, Object o) {
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(o));
    }

    public static void main(String[] args) {
        String s = "We are such stuff as dreams are made on";
        apply(new UpCase(), s);
        apply(new DownCase(), s);
        apply(new Splitter(), s);
    }
}
