package mySorting;

import BubbleSort.BubbleSort;

import java.util.List;

public class MySort {
    public List<String> sort(List<String> list) {
        // Sorting logic here
        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(list);
    }
}
