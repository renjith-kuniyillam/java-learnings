package QueueInCollection;

import java.util.List;
import java.util.PriorityQueue;

public class QueueRunner {
    public static void main(String[] args) {
        PriorityQueue<String> stringQ = new PriorityQueue<>(new AnimalComparator());
        stringQ.add("Zebra");
        stringQ.add("Dog");
        stringQ.add("Cat");
        stringQ.add("Elephant");
        stringQ.addAll(List.of("Mamoth", "Grasshopper", "Bee"));
        System.out.println(stringQ);

    }
}
