//count frequency of char
package STRINGS;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "takeuforward";   // Example input

        // Use HashMap to store frequency
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Update frequency
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Print frequencies
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue() + " ");
        }
    }
}
