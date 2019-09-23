package com.plantformsoftware;

public class Main {

  public static void main(String[] args) {
    var gameOver = true;
    var score = 800;
    var levelCompleted = 5;
    var bonus = 100;

//    if(score <= 5000) {
//      System.out.println("Your score was 5000");
//      System.out.println("This was executed");
//    } else {
//      System.out.println("Got here without 5000");
//    }
    if(gameOver == true) {
      var finalScore = score + (levelCompleted * bonus);
      System.out.println("Your final score was "+finalScore);
    }

    score = 10000;
    levelCompleted = 8;
    bonus = 200;
    if(gameOver == true) {
      var finalScore = score + (levelCompleted * bonus);
      System.out.println("Your new final score was "+finalScore);

    }
  }
}
