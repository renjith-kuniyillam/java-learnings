package Conditionals.IfElse;

public class IfElse {
    public static void main(String[] args) {
        int i = 25;
        if (i == 25) {
            System.out.println("The value of i is 25");
        } else if (i == 24) {
            System.out.println("The value of i is 24");
        } else if (i == 23) {
            System.out.println("The value of i is 23");
        } else {
            System.out.println("The value of i is " + i);
        }

        //puzzle 1
        IfElse.ifElsePuzzle();
        IfElse.integerValueNotConverted();
    }

    public static void ifElsePuzzle() {
        int i = 15;

        if (i < 20) {
            System.out.println("The value of i is 20");
        } else if (i < 25) {
            System.out.println("The value of i is 25");
        } else {
            System.out.println("The value of i is " + i);
        }
    }

    public static void integerValueNotConverted() {
        int j = 12;
        if (j == 12) {
            System.out.println("The value of j is 12");
        }
    }
}



