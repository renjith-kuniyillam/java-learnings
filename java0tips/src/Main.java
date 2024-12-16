//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import EqualsMethod.Client;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;
import static  java.lang.System.out;

public class Main {
    public static void main(String[] args) {
//       out.println("Imports");
//       List<String> abc = new ArrayList<>();
//        sort(abc);

        Client o1 = new Client(1);
        Client o2 = new Client(1);

        System.out.println(o1.equals(o2));

    }
}