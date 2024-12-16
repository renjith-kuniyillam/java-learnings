package FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class MaximumValueFunctional {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(1,2,3,4,5,6,7,8,9,10);

        int max = listOfIntegers.stream().max((n1, n2)-> n1.compareTo(n2)).get();

        System.out.println("Maximum value is ::" + max);


        int min = listOfIntegers.stream().min((n1, n2)-> n1.compareTo(n2)).get();

        System.out.println("Minimum value is ::" + min);

        //getOddNumbers();
        getMaximumValueEvenNumber();

    }

    public static void getOddNumbers() {
        List<Integer> listOfIntegers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> listOfOddNumbers = listOfIntegers.stream()
                .filter(number -> number % 2 != 0).toList();
        System.out.println("odd number list" + listOfOddNumbers);
    }

    public static void getMaximumValueEvenNumber() {
        List<Integer> listOfIntegers = List.of(25, 27, 23, 35);

        int max = listOfIntegers.stream()
                .filter(new EvenNumberPredicate())
                .max((n1, n2) -> n1.compareTo(n2)).orElse(0);
        System.out.println("Maximum value of even number is ::" + max);
    }


}
