package UserInputMenu;

import java.util.Scanner;

public class UserInputMenu {
    public static void main(String[] args) {
        System.out.println("Welcome to the User Input Menu");
        System.out.println("Please enter First number: ");
        Scanner sc1 = new Scanner(System.in);
        int firstNumber = sc1.nextInt();
        System.out.println("Please enter Second number: ");
        int secondNumber = sc1.nextInt();
        System.out.println("What do you want to do");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operation = sc1.nextInt();
        performActionBasedOnUserSelection(operation, firstNumber, secondNumber);
    }

    private static void performActionBasedOnUserSelection(int operation, int firstNumber, int secondNumber) {
        switch (operation) {
            case 1:
                System.out.println("Addition result is : " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Subtraction result is : " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println("Multiplication result is : " + (firstNumber * secondNumber));
                break;
            case 4:
                System.out.println("Division result is : " + (firstNumber / secondNumber));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
