package CollectionExcercise;

public class Excercise {
    public static void main(String[] args) {
        String str = "This is a great thing";

        Anagram anagram = new Anagram();

        boolean result = anagram.areAnagrams("Hello", "Olleh");
        System.out.println(result);
    }



}
