package FunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FunctionalMethodReferennces {
    public static void main(String[] args) {
        List<String> listOfStrings = List.of("Apple", "Banana", "Orange", "Grapes");

        listOfStrings.stream().forEach(x-> System.out.println(x));
        listOfStrings.stream().forEach(System.out::println);

        Predicate<String> a = (x) -> {
            return x.contains("a");
        };

        IntStream.range(1,10).boxed()

        listOfStrings.stream().filter(a).forEach(System.out::println);
        listOfStrings.stream().filter(FunctionalMethodReferennces::containsSubstring).forEach(System.out::println);
    }

    public static boolean containsSubstring(String x) {
        return x.contains("a");
    }
}
