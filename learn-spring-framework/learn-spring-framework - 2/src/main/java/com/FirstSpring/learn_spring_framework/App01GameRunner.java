package com.FirstSpring.learn_spring_framework;

import com.FirstSpring.learn_spring_framework.game.GameRunner;
import com.FirstSpring.learn_spring_framework.game.MarioGame;
import com.FirstSpring.learn_spring_framework.game.PacMan;
import com.FirstSpring.learn_spring_framework.game.SuperContra;

public class App01GameRunner {


    public static void main(String[] args) {
        System.out.println("Hello World!");
        var marionGame = new MarioGame();
        var superContraGame = new SuperContra();
        var pacmanGame = new PacMan();

        var gameRunner = new GameRunner(marionGame);
        var gameRunner2 = new GameRunner(superContraGame);
        var gameRunner3 = new GameRunner(pacmanGame);

        gameRunner.runGame();
        gameRunner2.runGame();
        gameRunner3.runGame();
    }
}
