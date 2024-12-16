package Interfaces;

import java.awt.datatransfer.FlavorEvent;
import java.util.Vector;

public class FlyableRunner {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        Flyable bird = new Bird();
        bird.fly();
        Flyable aeroplane = new Aeroplane();
        aeroplane.fly();
        Flyable[] flyingObjects = {bird, aeroplane};
        for (Flyable flyingObject : flyingObjects) {
            flyingObject.fly();
        }
    }
}
