package com.OnJava.Chapter11.innerclasses;

public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }

                String getSlip() { return id; }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String slip = ts.getSlip();
        }
    }

    public void track() {internalTracking(true);}

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }
}
