// Problem: Calculate the sum of all individual digits in a given positive integer.

import java.util.*;

class Solution3 {
    public int sumOfDigits(int n) {
        // Logic: Repeatedly grab the last digit using (n % 10), add it to sum, and drop it with (n / 10).
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int n = 456; // Input
        int result = sol.sumOfDigits(n);
        System.out.println(result);
        // Output: 15
    }
}
