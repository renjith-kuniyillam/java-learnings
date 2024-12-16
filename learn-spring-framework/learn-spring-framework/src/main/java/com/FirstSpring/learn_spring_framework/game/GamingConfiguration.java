package com.FirstSpring.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole getGame() {
        GamingConsole game = new MarioGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner() {
        return new GameRunner(getGame());
    }

}
