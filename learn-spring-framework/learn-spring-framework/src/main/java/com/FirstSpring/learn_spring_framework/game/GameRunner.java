package com.FirstSpring.learn_spring_framework.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void runGame() {
        game.start();

        game.up();
        game.down();
        game.left();
        game.right();

        game.end();
    }

}
