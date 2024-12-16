package StaticVarialbles;

public class Player {
    public String name;
    public static int playerCount = 0;

    public Player(String name) {
        this.name = name;
        playerCount++;
    }

}

