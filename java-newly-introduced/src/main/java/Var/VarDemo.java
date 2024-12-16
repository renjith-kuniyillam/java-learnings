package Var;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class VarDemo {
    public static void main(String[] args) {
       List<String> names1 = List.of("Renjith", "Ramesh");
       List<String> names2 = List.of("radd", "Tomans");

       var names = List.of(names1, names2);
       System.out.println(names);



    }
}
