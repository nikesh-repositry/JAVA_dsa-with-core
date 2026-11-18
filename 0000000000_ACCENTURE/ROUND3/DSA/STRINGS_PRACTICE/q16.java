// Problem: Check if string 'goal' can be obtained by rotating string 's'.

import java.util.*;

class Solution16 {
    public boolean rotateString(String s, String goal) {
        // Logic: Both strings must have the exact same length.
        // If you join 's' with itself (s + s), every possible rotation of 's' will appear inside it.
        if (s.length() != goal.length()) return false;
        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        String s = "abcde"; // Input 1
        String goal = "cdeab"; // Input 2
        boolean result = sol.rotateString(s, goal);
        System.out.println(result);
        // Output: true
    }
}
