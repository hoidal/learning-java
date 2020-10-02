package com.learningjava;

public class Main {

    public static void main(String[] args) {

        /* primivitive data types:
        byte
        short
        int
        long
        float
        double
        char
        boolean
         */

        // String is a class type and will concatenate if added (no automatic type coercion)

        int result = 1 + 2; // 1 + 2 = 3;
        result = result * 10; // 3 * 10 = 30;
        System.out.println(result);


        boolean isTrue = false;

        // don't need code blocks, but helps readability and allows for executing multiple lines
        // like javascript don't need '==' in if statement
        if(isTrue == false) {
            System.out.println("Not true");
        }


    }
}
