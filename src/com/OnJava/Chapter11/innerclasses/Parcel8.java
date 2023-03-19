package com.OnJava.Chapter11.innerclasses;

public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            @Override
            public int value(int x) {
                return super.value(x) * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8 = new Parcel8();
        parcel8.wrapping(10);
    }
}
