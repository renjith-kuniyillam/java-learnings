//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        method1();
        System.out.println("Main method executed successfully");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 executed successfully");
    }

    private static void method2() {
        try {
            int[] arr = {1,2,3};
            int number = arr[3];
            // String testString = null;
            // System.out.println(testString.length());
            System.out.println("Method2 executed successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred in method2");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred in method2");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception occurred in method2");
            e.printStackTrace();
        }
    }
}