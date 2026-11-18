// Problem: Check if a positive integer equals the sum of its proper divisors excluding itself (e.g., 28 = 1+2+4+7+14).

import java.util.*;

class Solution13 {
    public boolean isPerfectNumber(int n) {
        // Logic: Loop from 1 up to sqrt(n) to find all divisors. Add divisor pairs to sum, excluding n itself.
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        int n = 28; // Input
        boolean result = sol.isPerfectNumber(n);
        System.out.println(result);
        // Output: true
    }
}
