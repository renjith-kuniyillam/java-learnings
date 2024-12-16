package DaysOfTheWeek;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < days.length; i++) {
            System.out.println("Day " + numbers[i] + " is " + days[i]);
        }
        System.out.println("");
        printDaysBackWards();
        System.out.println("");
        printLongestDay();
    }

    public static void printDaysBackWards() {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = days.length - 1; i >= 0; i--) {
            System.out.println("Day " + numbers[i] + " is " + days[i]);
        }
    }

    public static void printLongestDay() {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int maxLength = 0;
        String longestDay = "";
        for(String day : days){
            if(day.length() > maxLength){
                maxLength = day.length();
                longestDay = day;
            }
        }
        System.out.println("The longest day of the week is " + longestDay);
    }

}
