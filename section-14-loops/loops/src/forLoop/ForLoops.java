package forLoop;

public class ForLoops {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(9);
        System.out.println("number 9 is prime " + isPrime(9));
        System.out.println("number 7 is prime " + isPrime(7));
        System.out.println("sum of number upto 9 is " + number.sumUptoN());
        System.out.println("sum of divisors of  9 is " + number.sumOfDivisors());
        System.out.println("Printing number triangle ");
        number.printNumberTriangle();
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for(int i= 2; i < number/2; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
