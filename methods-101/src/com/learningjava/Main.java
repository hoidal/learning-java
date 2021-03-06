package com.learningjava;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore);


        // Overloading
        // like other languages, you are able to have multiple methods of the same name that receive different arguments (and are called based on arguments provided)
        // example
        int sum1 = sum(1, 3);
        int sum2 = sum(1, 2, 3);
        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
