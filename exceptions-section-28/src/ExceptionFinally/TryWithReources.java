package ExceptionFinally;

import java.util.Scanner;

public class TryWithReources {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            //we are doing lot of operations
            int[] arr = {1, 2, 3};
            int number = arr[3];
            System.out.println("Main method executed successfully");
        }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            if(scanner != null) {
//                scanner.close();
//            }
//            System.out.println("Finally block executed");
//        }

    }
}
