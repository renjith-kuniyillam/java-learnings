package WhileLoop;

import java.util.Scanner;

public class WhileNumberPlayer {
    private int limit;

    public static void main(String[] args) {
        WhileNumberPlayer obj = new WhileNumberPlayer(25);
        // obj.printSquaresUptoLimit();
        // obj.printCube();
        // obj.printEvenNumbers(10);
        obj.printNumberTillZero(21);
    }

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }

    public void printSquaresUptoLimit() {
        double squareResult = 0, i = 1;
        while(squareResult <= limit) {
            if(Math.pow(i, 2) <= limit) {
                squareResult = Math.pow(i, 2);
                System.out.print(squareResult + " ");
            }
            i++;
        }
    }
    public void printCube() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("Enter an integer: ");
            number = sc.nextInt();
            System.out.println("The cube is " + number * number * number);
        } while(number >= 0);
    }

    public void printEvenNumbers(int limit) {
        for(int i = 1; i <= limit; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");

        }
    }

    public void printNumberTillZero(int limit) {
        for(int i = -limit;i <= limit; i++) {
            if(i == 0) {
                break;
            }
            System.out.print(i + " ");
        }
    }



}
