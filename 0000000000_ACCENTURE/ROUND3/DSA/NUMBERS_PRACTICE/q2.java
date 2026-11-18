// Problem: Return true if an integer reads the same backward as forward.

import java.util.*;

class Solution2 {
    public boolean isPalindrome(int x) {
        // Logic: Negative numbers are never palindromes.
        // Reverse the number and check if the reversed value equals the original number.
        if (x < 0) return false;
        int original = x, rev = 0;
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int x = 121; // Input
        boolean result = sol.isPalindrome(x);
        System.out.println(result);
        // Output: true
    }
}
