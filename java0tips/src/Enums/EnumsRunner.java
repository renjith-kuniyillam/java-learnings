package Enums;



public class EnumsRunner {


    public static void main(String[] args) {
        Season season = Season.WINTER;
        System.out.println(season);

        System.out.println(Season.valueOf("WINTER"));

        System.out.println(Season.SUMMER.ordinal());
        System.out.println(Season.FALL.getValue());
    }
}
