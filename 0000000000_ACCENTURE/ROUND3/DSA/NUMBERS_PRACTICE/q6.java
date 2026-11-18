// Problem: Determine whether a given integer N is a prime number.

import java.util.*;

class Solution6 {
    public boolean isPrime(int n) {
        // Logic: Numbers <= 1 are not prime.
        // Check divisibility only up to sqrt(n) because factors always come in pairs.
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int n = 29; // Input
        boolean result = sol.isPrime(n);
        System.out.println(result);
        // Output: true
    }
}
