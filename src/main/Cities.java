package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Cities {
    private HashSet<String> cities;

    public Cities (String csvFilePath){
        this.cities = new HashSet<>();
        readCSV(csvFilePath, 1);
    }

    private void readCSV(String csvFilePath, int columnIndex) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length > columnIndex) {
                    cities.add(columns[columnIndex].toLowerCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean has(String value) {
        // TODO: Why does this always return false
        return cities.contains(value.toLowerCase());
    }

    public HashSet<String> getCities() {
        return cities;
    }
}
