import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scenes scenes = new Scenes();
        // intro to the game
        scenes.runIntro();

        // input diseases and score until they type "done"
        scenes.runMainLoop();


        // Don't forget to close the scanner when you're done with it
        scenes.runEndScene();
    }
}