// Problem: Find the length of the longest substring that contains no duplicate characters.

import java.util.*;

class Solution21 {
    public int lengthOfLongestSubstring(String s) {
        // Logic: Use a sliding window with 'left' and 'right' pointers and a HashSet.
        // Expand 'right'. If s[right] is already in the set, shrink from 'left' until the duplicate is gone.
        Set<Character> window = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (window.contains(s.charAt(right))) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution21 sol = new Solution21();
        String s = "abcabcbb"; // Input
        int result = sol.lengthOfLongestSubstring(s);
        System.out.println(result);
        // Output: 3
    }
}
