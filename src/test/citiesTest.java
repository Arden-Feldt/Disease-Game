package test;

import main.Cities;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class citiesTest {
    public void hasCities() {
        // TODO: Set up tests
        String csvFilePath =
                "C:\\Users\\ethan\\IdeaProjects\\Disease-Game\\src\\main\\worldcities.csv";
        int columnIndex = 1;

        Cities cities = new Cities(csvFilePath, columnIndex);

        // These values should be in it
        assertTrue(cities.isInColumn("Tokyo"));
        assertTrue(cities.isInColumn("Sidi Rahhal"));
        assertTrue(cities.isInColumn("Boufatis"));

        // I know these values are in it
        assertTrue(cities.isInColumn("Doukouya"));
        assertTrue(cities.isInColumn("Sanatikri"));
    }
}
