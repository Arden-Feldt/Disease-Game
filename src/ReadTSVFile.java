import java.io.*;
import java.util.ArrayList;

public class ReadTSVFile {
  public static void main(String[] args) {
    String filePath =
        "C:\\Users\\ethan\\IdeaProjects\\sidesite\\src\\diseaseDataset\\human_disease_textmining_full.tsv"; // Replace with your TSV file path

    ArrayList<String> diseaseNames = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        // Split the line by tabs (\t) to get individual columns
        String[] columns = line.split("\t");

        // Extract the disease name (assuming it's the 4th column)
        if (columns.length >= 4) { // Ensure the line has at least 4 columns
          String diseaseName = columns[3]; // Index 3 corresponds to the disease name column
          diseaseNames.add(diseaseName);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    String csvFilePath = "diseaseNames.csv";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFilePath))) {
      for (String data : diseaseNames) {
        writer.write(data);
        writer.newLine();
      }
      System.out.println("CSV file has been created successfully!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
