package SwitchExpressions;

public class SwitchExpressionsDemo {


    public static void main(String[] args) {
        int day = 3;
        String dayOfWeek = switch (day) {
            case 1 -> {
                System.out.println("some operations");
                yield "Monday";
            }
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 ->  "Sunday";
            default -> throw new IllegalArgumentException("Illeigal argument");
        };

        System.out.println(dayOfWeek);



    }
}
