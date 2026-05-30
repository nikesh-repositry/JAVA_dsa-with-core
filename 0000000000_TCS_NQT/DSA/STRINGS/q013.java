package STRINGS;
//max occuring char
import java.util.HashMap;

public class MaxOccurringCharEasy {
    public static void main(String[] args) {
        String str = "apple";

        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int maxCount = -1;
        char maxChar = ' ';

        // Easier loop: iterate keys directly
        for (char ch : freq.keySet()) {
            int count = freq.get(ch);
            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
    }
}
