package CollectionExcercise;

import java.util.Arrays;

public class Anagram {


    public boolean areAnagrams(String str1, String str2) {
        char[] charArrayString1 = str1.toCharArray();
        char[] charArrayString2 = str2.toCharArray();

        for (int i = 0; i < charArrayString1.length; i++) {
            charArrayString1[i] = Character.toLowerCase(charArrayString1[i]);
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.trimToSize();

        for (int i = 0; i < charArrayString2.length; i++) {
            charArrayString2[i] = Character.toLowerCase(charArrayString2[i]);
        }

        Arrays.sort(charArrayString1);
        Arrays.sort(charArrayString2);

        return Arrays.equals(charArrayString1, charArrayString2);

    }
}
