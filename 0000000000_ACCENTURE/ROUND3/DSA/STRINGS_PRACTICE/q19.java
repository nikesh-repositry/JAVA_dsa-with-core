// Problem: Count how many times a target substring appears inside a larger text string.

import java.util.*;

class Solution19 {
    public int countSubstring(String text, String sub) {
        // Logic: Use indexOf(sub, index) to find the next match starting from 'index'.
        // Every time a match is found, increment count and move 'index' past that match.
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        String text = "abababa"; // Input text
        String sub = "aba"; // Input substring
        int result = sol.countSubstring(text, sub);
        System.out.println(result);
        // Output: 2
    }
}
