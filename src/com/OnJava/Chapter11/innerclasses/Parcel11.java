package com.OnJava.Chapter11.innerclasses;

/**
 * 内部嵌套类
 * 不需要与外部类建立联系
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static final class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }

        public static void f() {}

        static int x = 10;

        static class AnotherLevel{
            public static void f() {}
            static int x = 10;
        }
    }

    public static Destination destination(String label) {
        return new ParcelDestination(label);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents contents = contents();
        Destination label = destination("Label");
    }
}
