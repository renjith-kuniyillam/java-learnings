package StaticVarialbles;

public class PlayerRunner {
    public static final int MINUTES_IN_AN_HOUR = 60;
    public static final int SECONDS_IN_A_MINUTE = 60;
    public static final int HOUR_IN_A_DAY = 24;

    public static void main(String[] args) {
        Player player1 = new Player("John");
        System.out.println(Player.playerCount);
        Player player2 = new Player("Doe");
        System.out.println(Player.playerCount);

        Integer i = Integer.valueOf("1");
        System.out.printf("No of seconds in a day is :: %d\n", MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE * HOUR_IN_A_DAY);

    }
}
