package com.learningjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // switch example
	    int num = 2;
	    switch(num) {
            case 0:
                System.out.println("Num is: " + num);
                break;
            case 1:
                System.out.println("Num is: " + num);
                break;
            case 2:
                System.out.println("Num is " + num);
                break;
            default:
                System.out.println("Num not in range.");
                break;
        }

        // for loop
        for(int i=0; i < 3; i++) {
            System.out.println("For loop at: " + i);
        }

        int count = 1;
        // while loop
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        // do while loop (runs once regardless if condition met)
        do {
            System.out.println("Do-while count is: " + count);
            count++;
        } while (count < 21);

        // string methods
        // note many more common examples to add
        String x = "airplane";
        int xLength = x.length(); // string length
        boolean xIsEmpty = x.isEmpty(); // empty string?
        char xCharAtIndex = x.charAt(5); // char at index
        boolean xEquals = x.equals("airplane"); // compares string objects


        startScanner();
    }

    // user input with scanner (notice import at file top)
    public static void startScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        int age = 2020 - yearOfBirth;

        System.out.println("Your name is " + name + " and you are " + age + " years old.");

        scanner.close();
    }
}
