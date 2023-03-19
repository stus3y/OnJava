package com.OnJava.Chapter11.innerclasses;

public class Parcel4 {
    /**
     * private 内部类只有父类可以访问  外部类没有访问权限
     */
    private class PContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    /**
     *  protected 只能被同包中的类访问
     */
    protected final class PDestination implements Destination {
        private String label;

        public PDestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}

class TestParcel {
    public static void main(String[] args) {
        var parcel = new Parcel4();
        var contents = parcel.contents();
        var destination = parcel.destination("Tasmania");
        var tasmania = parcel.new PDestination("Tasmania");
    }
}