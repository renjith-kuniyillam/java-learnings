package MySortRunnerPackage;

import BubbleSort.BubbleSort;

import java.util.List;

public class AnotherConsumer {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(bubbleSort.sort(List.of("Ramesh", "Suresh", "Mahesh", "Naresh", "Ganesh")));
    }
}
