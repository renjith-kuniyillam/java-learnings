package copyOf;

import java.util.ArrayList;
import java.util.List;

public class CopyOfRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        List<String> copiedList = List.copyOf(list);
        addItems(copiedList);
        System.out.println(list);



    }

    //add items to list
    public static void addItems(List<String> list) {
        list.add("Again");
        list.add("Again");
        list.add("!");
    }
}
