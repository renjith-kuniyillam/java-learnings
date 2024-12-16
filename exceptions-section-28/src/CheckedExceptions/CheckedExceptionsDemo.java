package CheckedExceptions;

public class CheckedExceptionsDemo {
    public static void main(String[] args) {
        method1();
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void method1() throws RuntimeException {
        //TO DO
    }
}
