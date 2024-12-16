package QueueInCollection;

import java.util.Comparator;

public class AnimalComparator implements Comparator<String> {
    @Override
    public int compare(String animal1, String animal2) {
        return Integer.compare(animal1.length(), animal2.length());
    }
}
