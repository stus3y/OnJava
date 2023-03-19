package com.OnJava.Chapter11.innerclasses;

public class Parcel2 {
    class Contents {
        private int i = 11;
        public int value() { return i; }
    }

    class Destination {
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        var contents = contents();
        var d = to(dest);
        System.out.println(d.getLabel());
    }

    public static void main(String[] args) {
        var parcel2 = new Parcel2();
        parcel2.ship("Tasmania");

        var q = new Parcel2();
        var c = q.contents();
        var d = q.to("Borne");
    }
}
