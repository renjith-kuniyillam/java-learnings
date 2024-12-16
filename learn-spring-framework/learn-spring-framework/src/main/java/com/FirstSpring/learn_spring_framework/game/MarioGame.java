package com.FirstSpring.learn_spring_framework.game;

public class MarioGame implements GamingConsole {
    public MarioGame() {
        System.out.println("Mario Game");
    }
    public void start() {
        System.out.println("Mario Started");
    }
    public void end() {
        System.out.println("Mario Finished");
    }

    public void up() {
        System.out.println("Mario Jumped");
    }

    public void down() {
        System.out.println("Mario Ducked");
    }

    public void left() {
        System.out.println("Mario Moved Left");
    }

    public void right() {
        System.out.println("Mario Moved Right");
    }



}
