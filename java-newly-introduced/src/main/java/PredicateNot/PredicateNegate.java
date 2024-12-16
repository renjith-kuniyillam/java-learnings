package PredicateNot;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNegate {

    static boolean isEven(int n) {
        return n%2 == 0;
    }

    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> listOfNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        listOfNumbers.stream()
                .filter(isEven.negate())
                .forEach(System.out::println);

        // Using the static method
        listOfNumbers.stream()
                .filter(PredicateNegate::isEven)
                .forEach(System.out::println);
        System.out.println("==using static method==");
        listOfNumbers.stream()
                .filter(Predicate.not(PredicateNegate::isEven))
                .forEach(System.out::println);

    }
}
