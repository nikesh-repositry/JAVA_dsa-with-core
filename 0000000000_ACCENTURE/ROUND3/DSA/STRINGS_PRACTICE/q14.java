// Problem: Find the first character that appears more than once as you scan from left to right.

import java.util.*;

class Solution14 {
    public char firstRepeatingChar(String s) {
        // Logic: Keep a HashSet of characters seen so far.
        // The moment we encounter a character already inside the set, return it immediately.
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }
        return '_';
    }

    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        String s = "abca"; // Input
        char result = sol.firstRepeatingChar(s);
        System.out.println(result);
        // Output: a
    }
}
