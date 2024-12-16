package ExcerciseCollections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CharacterUniqueAcending {

    public static void main(String[] args) {
        List<Character> listOfChar = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        Set<Character> listOfCharInAscendingOrder = new TreeSet<Character>(listOfChar);

        System.out.println(listOfCharInAscendingOrder);

    }
}
