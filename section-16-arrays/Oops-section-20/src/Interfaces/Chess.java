package Interfaces;

public class Chess implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Move piece up");
    }

    @Override
    public void down() {
        System.out.println("Move piece down");
    }

    @Override
    public void left() {
        System.out.println("Move left");
    }

    @Override
    public void right() {
        System.out.println("Move right");
    }
}
