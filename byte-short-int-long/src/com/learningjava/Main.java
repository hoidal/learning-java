package com.learningjava;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // can add underscores to make number more readable (uncommon)
        int myMaxIntTest = 2_147_483_647;


        // byte data type -128 to 128 (uncommon to use, unless specific needs to save memory)
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // short -32768 to 32768
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // byte occupies 8 bits (width of 8).
        // short occupies 16 bits (width of 16).
        // integer occupies 32 bits (width of 32).
        // long occupies 64 bits (width of 64).

        // type casting example (integer will be assumed automatically unless specified)
        // always use integer unless good reason not to
        byte myNewByteValue = (byte)(myMinByteValue / 2);
    }
}
