package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ScoreCalculator {

  private static ArrayList<String> diseaseArray;
  private static ArrayList<String> previousInputs = new ArrayList<>();
  private static int score = 0;

  public static void populateDiseaseArray() {
    String csvFilePath =
        "C:\\Users\\ethan\\IdeaProjects\\Disease-Game\\src\\diseaseDataset\\diseaseNames.csv";

    diseaseArray = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        diseaseArray.add(line);
      }
    } catch (IOException e) {
      System.out.println("populator is busted");
    }
  }

  public static void updateScore(String input) {
    if (isDisease(input) && stopRepeats(input)) {
      if (input.length() >= 9 && !input.contains("cancer")) {
        score += 3;
      } else if (input.length() >= 6 && !input.contains("cancer")) {
        score += 2;
      } else {
        score += 1;
      }
    }
    previousInputs.add(input);
  }

  public static boolean stopRepeats(String input) {
    for (String name : previousInputs) {
      if (input.equalsIgnoreCase(name)) {
        return false;
      }
    }
    return true;
  }

  public static ArrayList<String> getDiseaseArray() {
    return diseaseArray;
  }

  public static int getScore() {
    return score;
  }

  public static boolean isDisease(String input) {
    boolean isDisease = false;
    for (String diseaseName : diseaseArray) {
      if (input.equalsIgnoreCase(diseaseName)) {
        isDisease = true;
        break;
      }
    }
    return isDisease;
  }
}
