package forLoop;

public class MyNumber {

    public int getNumber() {
        return number;
    }

    private int number;

    MyNumber(int initNumber) {
        number = initNumber;
    }

    public int sumUptoN() {
        int result = 0;
        for(int i = 0; i <= number; i++) {
            result += i;
        }
        return result;
    }

    public int sumOfDivisors() {
        int result = 0;
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                result += i;
            }
        }
        return result;
    }

    public void printNumberTriangle() {
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
