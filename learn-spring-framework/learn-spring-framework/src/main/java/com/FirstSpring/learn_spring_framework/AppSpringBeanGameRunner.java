package com.FirstSpring.learn_spring_framework;

import com.FirstSpring.learn_spring_framework.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringBeanGameRunner {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            var gameRunner = context.getBean(GameRunner.class);
            gameRunner.runGame();
        }

    }
}
