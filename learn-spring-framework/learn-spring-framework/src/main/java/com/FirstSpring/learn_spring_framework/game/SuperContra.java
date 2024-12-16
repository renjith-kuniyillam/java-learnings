package com.FirstSpring.learn_spring_framework.game;

public class SuperContra implements GamingConsole {
    public SuperContra() {
        System.out.println("Super Contra Game");
    }
    public void start() {
        System.out.println("Super Contra Started");
    }
    public void end() {
        System.out.println("Super Contra Finished");
    }

    public void up() {
        System.out.println("Super Contra Jumped");
    }

    public void down() {
        System.out.println("Super Contra Ducked");
    }

    public void left() {
        System.out.println("Super Contra Moved Left");
    }

    public void right() {
        System.out.println("Super Contra Moved Right");
    }
}
