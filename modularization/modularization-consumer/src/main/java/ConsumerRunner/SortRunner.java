package ConsumerRunner;

import BubbleSort.BubbleSort;
import MySort.MySortClass;

import java.util.List;

public class SortRunner {
    public static void main(String[] args) {
        // Sort the list
        // Print the sorted list
        List<String> listOfString = List.of("c", "a", "b");
        MySortClass mySortClass = new MySortClass();
        listOfString = mySortClass.sort(listOfString);
        BubbleSort bubbleSort = new BubbleSort();
        listOfString = bubbleSort.sort(listOfString);



    }
}
