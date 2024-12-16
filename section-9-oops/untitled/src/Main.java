import com.BiNumber.BiNumber;
import com.MyChar.MyChar;
import com.SimpleInterestCalculator.SimpleInterestCalculator;
import com.books.Book;
import com.motorBike.MotorBike;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);
        /**
         * Starting the bikes
         */
        ducati.start();
        ducati.setSpeed(-100);
        System.out.println(ducati.getSpeed());
        honda.start();
        honda.setSpeed(70);
        System.out.println(honda.getSpeed());

        MotorBike someBrand = new MotorBike();
        /**
         * Stopping the vehicle
         */
        ducati.stop();
        honda.stop();

        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();
        artOfComputerProgramming.bookName = "The Art of Programming";
        artOfComputerProgramming.noOfCopies = 10;
        effectiveJava.bookName = "The Effective Java";
        effectiveJava.noOfCopies = 20;
        cleanCode.bookName = "Clean Code";
        cleanCode.noOfCopies = 30;


        //BI number actions
        BiNumber numbers = new BiNumber(2, 3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
        numbers.doubleNumber();
        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());

        //Simple Inerest
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println("==== Total value is: " + totalValue);

        //Char tests
        MyChar ch = new MyChar('D');
        System.out.println("is a vowel" + ch.isVowel());
        MyChar ch1 = new MyChar('8');
        System.out.println("is a number" + ch.isNumber());
        MyChar ch2 = new MyChar('5');
        System.out.println("is a alshabet " + ch2.isAlphabet());
        MyChar ch3 = new MyChar('g');
        System.out.println("is a alshabet " + ch3.isAlphabet());
        MyChar.printAllSmallAlphabets();
        MyChar.printAllUpperAlphabets();



    }
}