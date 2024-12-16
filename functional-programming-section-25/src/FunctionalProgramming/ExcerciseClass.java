package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ExcerciseClass {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = IntStream.range(1,10)
                .boxed()
                .map(i -> i * i).toList();
        listOfIntegers.stream().forEach(System.out::println);

        List<String> listOgWords = List.of("Apple", "Bat", "Ant");
        List<String> listOgWords2 = listOgWords.stream().map(word -> word.toLowerCase()).toList();
        listOgWords2.stream().forEach(System.out::println);

        listOgWords2.stream().forEach(x -> {
            System.out.printf("Length  of %s is : %d", x ,x.length()).println();
        });
    }
}
