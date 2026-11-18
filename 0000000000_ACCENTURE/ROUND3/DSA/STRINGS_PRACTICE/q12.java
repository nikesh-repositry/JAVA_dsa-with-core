// Problem: Check if two strings contain the exact same characters in the same frequencies.

import java.util.*;

class Solution12 {
    public boolean isAnagram(String s, String t) {
        // Logic: If lengths differ, they cannot be anagrams.
        // Use an array of size 26 to count letters: add 1 for characters in 's' and subtract 1 for 't'.
        // If all counts return to 0, they are anagrams.
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        String s = "listen"; // Input 1
        String t = "silent"; // Input 2
        boolean result = sol.isAnagram(s, t);
        System.out.println(result);
        // Output: true
    }
}
