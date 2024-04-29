package main;

public class Main {
  public static void main(String[] args) {
    // TODO: Figure out why this is fucked
    String csvFilePath =
            "C:\\Users\\ethan\\IdeaProjects\\Disease-Game\\src\\main\\worldcities.csv";
    int columnIndex = 1;

    Cities cities = new Cities(csvFilePath);

    // These values should be in it
    System.out.println(cities.has("Tokyo"));
    System.out.println(cities.has("Sidi Rahhal"));
    System.out.println(cities.has("Boufatis"));

    System.out.println(cities.getCities().contains("Boufatis"));

    // I know these values are in it
    System.out.println(cities.has("spisska nova ves"));
    System.out.println(cities.has("karajgi"));

    // "spisska nova ves", "poggibonsi", "sandomierz", "hatti", "khallikot", "reggane", "aglasun", "jalor", "harihar",
    // "muzaffarabad", "oued tlelat"

    Player player = new Player();
    player.player();
  }
}
