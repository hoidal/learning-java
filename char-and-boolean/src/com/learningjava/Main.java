package com.learningjava;

public class Main {

    public static void main(String[] args) {

        // single quotes in declaration
        // one character but occupies 2 bytes (width 16) due to unicode
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        // both print same thing

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
    }
}
