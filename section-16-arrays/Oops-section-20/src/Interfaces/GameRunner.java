package Interfaces;

public class GameRunner {
    public static void main(String[] args) {
        GamingConsole game = new MarioGame();
        game.up();
        game.down();
        game.left();
        game.right();
        ((MarioGame) game).run();
    }
}
