package MySort;

import BubbleSort.BubbleSort;

import java.util.List;

public class MySortClass {
    public List<String> sort(List<String> list) {
        BubbleSort bubbleSort = new BubbleSort();
        list = bubbleSort.sort(list);
        System.out.println("Inside MySort class" + list);
        return list;
    }
}
