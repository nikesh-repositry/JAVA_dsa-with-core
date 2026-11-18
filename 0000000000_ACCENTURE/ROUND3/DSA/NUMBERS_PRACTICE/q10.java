// Problem: Check if the sum of its digits each raised to the power of total digits equals the number itself.

import java.util.*;

class Solution10 {
    public boolean isArmstrong(int n) {
        // Logic: Count the number of digits 'k'.
        // Raise each digit to the power 'k', sum them up, and compare with the original number.
        int original = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        int n = 153; // Input (1^3 + 5^3 + 3^3 = 153)
        boolean result = sol.isArmstrong(n);
        System.out.println(result);
        // Output: true
    }
}
