package com.OnJava.Chapter13;

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArgs(String head, Double d);
}

public class LambdaExpressions {
    static Body body = h -> h + "No Parents!";
    static Body body2 = h -> h + "More Details";
    static Description desc = () -> "Short Info";
    static Multi multi = (h, n) -> h + n;
    static Description moreLines = () -> {
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(body.detailed("Oh!"));
        System.out.println(body2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(multi.twoArgs("Pi!", 3.1415926));
        System.out.println(moreLines.brief());
    }
}
