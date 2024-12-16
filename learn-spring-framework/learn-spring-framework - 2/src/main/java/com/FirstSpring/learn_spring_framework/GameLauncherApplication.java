package com.FirstSpring.learn_spring_framework;

import com.FirstSpring.learn_spring_framework.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.FirstSpring.learn_spring_framework.game")
public class GameLauncherApplication {

//    @Bean
//    public GamingConsole getGame() {
//        GamingConsole game = new MarioGame();
//        return game;
//    }
//
//    @Bean
//    public GameRunner gameRunner() {
//        return new GameRunner(getGame());
//    }


    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GameLauncherApplication.class)) {
            var gameRunner = context.getBean(GameRunner.class);
            gameRunner.runGame();
        }

    }
}
