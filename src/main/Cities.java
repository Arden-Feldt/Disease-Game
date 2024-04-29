package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Cities {
    private HashSet<String> cities;

    public Cities (String csvFilePath, int columnIndex){
        this.cities = new HashSet<>();
        readCSV(csvFilePath, columnIndex);
    }

    private void readCSV(String csvFilePath, int columnIndex) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length > columnIndex) {
                    cities.add(columns[columnIndex]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isInColumn(String value) {
        return cities.contains(value);
    }

    public HashSet<String> getCities() {
        return cities;
    }
}
