package com.plantformsoftware;

public class Main {

    public static void main(String[] args) {

        var gameOver = true;
        var score = 800;
        var levelCompleted = 5;
        var bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("Your final score was "+highScore);

        gameOver = true;
        score = 0;
        levelCompleted = 1;
        bonus = 10;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was "+highScore);
        var name = "Steve";
        displayHighScorePosition(name, highScore);

    }

    public static void displayHighScorePosition(String name, int score) {
        if (score > 1000) {
            System.out.println(name +" is ranked 1");
        } else if (score > 500 && score < 1000) {
            System.out.println(name +" is ranked 2");
        }	else if (score > 100 && score <= 500) {
            System.out.println(name +" is ranked 3");
        } else {
            System.out.println(name +" is ranked 4");
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            var finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }
}