// Problem: Find the first character in a string that appears only once. Return '_' if none exists.

import java.util.*;

class Solution13 {
    public char firstUniqChar(String s) {
        // Logic: First pass: count how many times each character appears using a HashMap.
        // Second pass: walk through the string again and return the first character with a count of 1.
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        String s = "swiss"; // Input
        char result = sol.firstUniqChar(s);
        System.out.println(result);
        // Output: w
    }
}
