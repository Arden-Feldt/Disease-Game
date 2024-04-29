package main;

public class Player {
    public void player(){
        Scenes scenes = new Scenes();
        // intro to the game
        scenes.runIntro();

        // input diseases and score until they type "done"
        scenes.runMainLoop();

        // Don't forget to close the scanner when you're done with it
        scenes.runEndScene();
    }
}
