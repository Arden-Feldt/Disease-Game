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

        Cities cities = new Cities(csvFilePath);

        // These values should be in it
        assertTrue(cities.has("Tokyo"));
        assertTrue(cities.has("Sidi Rahhal"));
        assertTrue(cities.has("Boufatis"));

        // I know these values are in it
        assertTrue(cities.has("Doukouya"));
        assertTrue(cities.has("Sanatikri"));
    }
}
