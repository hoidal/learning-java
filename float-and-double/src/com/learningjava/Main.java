package com.learningjava;

public class Main {

    public static void main(String[] args) {
        // float is single precision and occupies 32 bits (width of 32)
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value " + myMinFloatValue);
        System.out.println("Float maximum value " + myMaxFloatValue);

        // double is double precision and occupies 64 bits (width of 64)
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value " + myMinDoubleValue);
        System.out.println("Double maximum value " + myMaxDoubleValue);

        int myIntValue = 5;

        // note that double is assumed float type, so you must specify with f;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25; // or 5.25d
    }
}
