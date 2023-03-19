package com.OnJava.Chapter10.interfaces.interfaceprocessor;

import java.util.Arrays;

public interface StringProcessor extends Processor{
    /**
     * 协变方法
     *
     * @param input
     * @return
     */
    @Override
    String process(Object input);
    String S = "If she weighs the same as a duck, " + "she's made of wood";
    static void main(String[] args) {
        Applicator.apply(new UpCase(), S);
        Applicator.apply(new DownCase(), S);
        Applicator.apply(new SplitCase(), S);
    }
}

class UpCase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class DownCase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class SplitCase implements StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
