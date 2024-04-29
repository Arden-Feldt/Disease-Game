package main;

public class Main {
  public static void main(String[] args) {
    String csvFilePath =
            "C:\\Users\\ethan\\IdeaProjects\\Disease-Game\\src\\main\\worldcities.csv";
    int columnIndex = 1;

    Cities cities = new Cities(csvFilePath, columnIndex);

    // These values should be in it
    System.out.println(cities.isInColumn("Tokyo"));
    System.out.println(cities.isInColumn("Sidi Rahhal"));
    System.out.println(cities.isInColumn("Boufatis\n"));

    // I know these values are in it
    System.out.println(cities.isInColumn("Doukouya"));
    System.out.println(cities.isInColumn("Sanatikri"));

    System.out.println(cities.getCities());

    Player player = new Player();
    player.player();
  }
}
