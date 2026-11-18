// Problem: Count how many digits are present in a given integer.

import java.util.*;

class Solution4 {
    public int countDigits(int n) {
        // Logic: If n is 0, it has 1 digit.
        // Otherwise, divide n by 10 repeatedly and increment the counter until n becomes 0.
        if (n == 0) return 1;
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        int n = 98765; // Input
        int result = sol.countDigits(n);
        System.out.println(result);
        // Output: 5
    }
}
