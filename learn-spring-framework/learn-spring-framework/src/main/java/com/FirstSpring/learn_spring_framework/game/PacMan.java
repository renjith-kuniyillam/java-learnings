package com.FirstSpring.learn_spring_framework.game;

public class PacMan implements GamingConsole{
    public PacMan() {
        System.out.println("PacMan Game");
    }
    public void start() {
        System.out.println("PacMan Started");
    }
    public void end() {
        System.out.println("PacMan Finished");
    }

    public void up() {
        System.out.println("PacMan Jumped");
    }

    public void down() {
        System.out.println("PacMan Ducked");
    }

    public void left() {
        System.out.println("PacMan Moved Left");
    }

    public void right() {
        System.out.println("PacMan Moved Right");
    }
}
