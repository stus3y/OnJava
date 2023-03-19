package com.OnJava.Chapter11.innerclasses;

public class Parcel7 {
    public Contents getContents() {
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        parcel7.getContents();
    }
}
