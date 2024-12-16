package Conditionals.Switch;

public class SwitchExcercises {
    public static void main(String[] args) {
        System.out.println("passing 2 to isWeekDay:" + isWeekDay(2));
        System.out.println("passing 6 to  determineNameOfDay:" + determineNameOfDay(6));

    }

    public static boolean isWeekDay(int dayNumber) {

        

        switch (dayNumber) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return false;
            default:
                return true;
        }
    }

    public static String determineNameOfDay(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }






}
