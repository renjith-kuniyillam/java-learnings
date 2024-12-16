package CollectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 9, 3, 5, 4, 7);
        ArrayList<Integer> arrayList = new ArrayList<>(numbers);
        System.out.println(numbers);
        Collections.sort(arrayList);


        ArrayList<Student> collection = new ArrayList<>();
        collection.add(new Student("John", 21));
        collection.add(new Student("Jane", 22));
        collection.add(new Student("Tom", 23));
        collection.add(new Student("Jerry", 24));
        collection.add(new Student("Alice", 25));
        collection.add(new Student("Bob", 26));
        collection.add(new Student("Charlie", 27));
        collection.add(new Student("Wendy", 47));
        collection.add(new Student("Xavier", 48));
        collection.add(new Student("Yvonne", 49));
        collection.add(new Student("Zack", 50));
        collection.add(new Student("Abe", 51));
        collection.add(new Student("Beth", 52));
        collection.add(new Student("Carl", 53));
        collection.add(new Student("Dora", 54));
        collection.add(new Student("Eli", 55));
        collection.add(new Student("Faye", 56));
        collection.add(new Student("Gus", 57));
        collection.add(new Student("Holly", 58));
        collection.add(new Student("Ike", 59));
        collection.add(new Student("Jill", 60));
        collection.add(new Student("Kurt", 61));
        collection.add(new Student("Lana", 62));

        Collections.sort(collection, new StudentNameComparatorAscending());
        System.out.println("Acending order");
        System.out.println(collection);
        System.out.println("Decending order");
        Collections.sort(collection, new StudentDecendingNameComparator());
        System.out.println(collection);

        collection.sort(new StudentNameComparatorAscending());
        collection.sort(new StudentDecendingNameComparator());
    }




}
