package com.FirstSpring.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("PacManQualifier") GamingConsole game) {
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
