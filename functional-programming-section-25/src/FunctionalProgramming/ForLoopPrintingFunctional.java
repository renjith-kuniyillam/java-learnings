package FunctionalProgramming;

import java.util.List;

public class ForLoopPrintingFunctional {
    List<String> listOfItems;
    List<Integer> listOfIntegers;
    public ForLoopPrintingFunctional(List<String> listOfItems, List<Integer> listOfIntegers) {
        this.listOfItems = listOfItems;
        this.listOfIntegers = listOfIntegers;
    }

    public void printListNormal() {
        for (String item : listOfItems) {
            System.out.println(item);
        }
    }

    public void printListFunctional() {
        listOfItems.stream().forEach(item -> System.out.println(item));
    }

    public void printListFunctional2() {
        listOfIntegers.stream().forEach(item -> {
            System.out.println("Printin the number ::" + item);
        });
    }

/**
 * Prints all odd numbers from the list of integers.
 *
 * This method uses Java Streams to filter out the odd numbers
 * from the list of integers and then prints each odd number.
 */
public void printListOfOddNumbers() {
    listOfIntegers.stream()
            .filter(number -> number % 2 != 0)
            .forEach(new forEachPredicate());
}

/**
 * Prints all even numbers from the list of integers.
 *
 * This method uses Java Streams to filter out the even numbers
 * from the list of integers and then prints each even number.
 */
public void printListOfEvenNumbers() {
    listOfIntegers.stream()
            .filter(number -> number % 2 == 0)
            .forEach(item -> {
        System.out.println("Printing even number ::" + item);
    });
}

public void printSumOfNumbers() {
    int sum = listOfIntegers.stream().reduce(0, (a, b) -> {
        return a + b;
    });
    System.out.println("Sum of numbers is ::" + sum);
}

/**
 * Prints the sum of all odd numbers from the list of integers.
 *
 * This method uses Java Streams to filter out the odd numbers
 * from the list of integers, sums them up, and then prints the sum.
 */
public void printSymOfOddNumbers() {
    int sum = listOfIntegers.stream()
            .filter(number -> number % 2 != 0)
            .reduce(0, (a, b) -> {
                return a + b;
            });
    System.out.println("Sum of odd numbers is ::" + sum);
}

/**
 * Prints the sum of all even numbers from the list of integers.
 *
 * This method uses Java Streams to filter out the even numbers
 * from the list of integers, sums them up, and then prints the sum.
 */
public void printSumOfEvenNumbers() {
    int sum = listOfIntegers.stream()
            .filter(number -> number % 2 == 0)
            .reduce(0, (a, b) -> {
                return a + b;
            });
    System.out.println("Sum of even numbers is ::" + sum);
}


}
