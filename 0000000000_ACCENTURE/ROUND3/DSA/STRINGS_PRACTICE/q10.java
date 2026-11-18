// Problem: Return the very first character of a given non-empty string.

import java.util.*;

class Solution10 {
    public char firstCharacter(String s) {
        // Logic: Strings in Java are 0-indexed.
        // Use the built-in charAt(0) method to grab the character at index 0.
        if (s == null || s.isEmpty()) {
            return '\0';
        }
        return s.charAt(0);
    }

    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        String s = "Hello"; // Input
        char result = sol.firstCharacter(s);
        System.out.println(result);
        // Output: H
    }
}
