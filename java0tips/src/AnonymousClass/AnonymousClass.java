package AnonymousClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClass {
    public static void main(String[] args) {
        ArrayList<String> animalList = new ArrayList<>(List.of("Elephant", "Lion", "Tiger", "Giraffe"));

        Comparator<String> c = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Collections.sort(animalList, c);
        System.out.println(animalList);


    }
}
