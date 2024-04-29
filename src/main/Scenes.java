package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Scenes {

  private static ArrayList<String> diseaseArray;

  public void runIntro() {
    // Intro
    System.out.println("Welcome to Diseasego!");
    System.out.println("The goal of this game is to name as many diseases as possible");

    // implement leaderboard functions
    System.out.println("-=-=-=-=- LEADER BOARD -=-=-=-=-=-");

    Scanner scanner = new Scanner(System.in);

    // queue up
    boolean ready = false;
    System.out.println("Ready to start? (Y/N)");
    String readyCheck = scanner.nextLine();
    if (readyCheck.equalsIgnoreCase("y")) {
      System.out.println("GREAT! GOOD LUCK!");
    }
    while (!readyCheck.equalsIgnoreCase("y")) {
      System.out.println("Let us know when you ready to start by typing: Y");
      readyCheck = scanner.nextLine();
    }
  }

  public void runMainLoop() {
    boolean keepPlaying = true;
    ScoreCalculator.populateDiseaseArray();
    String input = "";
    Scanner scanner = new Scanner(System.in);
    // Start the game loop
    while (keepPlaying) {
      System.out.print("Write the name of a disease: ");
      input = scanner.nextLine();
      if (input.equalsIgnoreCase("done")) {
        keepPlaying = false;
      }
      if (!ScoreCalculator.stopRepeats(input)) {
        System.out.println("You've already input " + input + "!");
      } else if (!ScoreCalculator.isDisease(input)) {
        System.out.println(input + " is not a recognized disease :(");
      }
      ScoreCalculator.updateScore(input);
      System.out.println("You now have " + ScoreCalculator.getScore() + " points!");
    }
    scanner.close();
  }

  public void runEndScene() {
    System.out.println("Your Score was:" + ScoreCalculator.getScore());
  }
}
