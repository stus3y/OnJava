package com.OnJava.Chapter11.innerclasses;

public class Parcel5 {
    public Destination destination(String s) {
        final class PDestination implements Destination {
            private String label;

            public PDestination(String label) {
                this.label = label;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        parcel5.destination("Tasmania");
    }
}
