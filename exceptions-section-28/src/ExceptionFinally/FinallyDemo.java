package ExceptionFinally;

import java.util.Scanner;

public class FinallyDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        try {
            //we are doing lot of operations
            int[] arr = {1, 2, 3};
            int number = arr[3];
            System.out.println("Main method executed successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(scanner != null) {
                scanner.close();
            }
            System.out.println("Finally block executed");
        }

    }
}
