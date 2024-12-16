package MySortRunnerPackage;

import mySorting.MySort;

import java.util.List;

public class MySortRunner {
    public static void main(String[] args) {
        List<String> myList = List.of("Ramesh", "Suresh", "Mahesh", "Naresh", "Ganesh");
        MySort mySort = new MySort();
        List<String> sortedList = mySort.sort(myList);
        System.out.println(sortedList);
    }
}
