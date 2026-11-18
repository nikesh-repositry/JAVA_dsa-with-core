// Problem: Check if the sum of the factorials of all digits equals the original number (e.g., 145 = 1! + 4! + 5!).

import java.util.*;

class Solution12 {
    public boolean isStrongNumber(int n) {
        // Logic: Extract each digit, compute its factorial, and add it to sum.
        // Compare the total sum with the original number.
        int original = n, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += getFactorial(digit);
            n /= 10;
        }
        return sum == original;
    }

    private int getFactorial(int d) {
        int fact = 1;
        for (int i = 2; i <= d; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        int n = 145; // Input
        boolean result = sol.isStrongNumber(n);
        System.out.println(result);
        // Output: true
    }
}
