// Problem: Remove all duplicate characters from a string while keeping the original order.

import java.util.*;

class Solution11 {
    public String removeDuplicates(String s) {
        // Logic: Use a LinkedHashSet because it stores only unique items and remembers insertion order.
        // Loop through the string, add each character to the set, and build the final string.
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            seen.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : seen) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        String s = "programming"; // Input
        String result = sol.removeDuplicates(s);
        System.out.println(result);
        // Output: progamin
    }
}
