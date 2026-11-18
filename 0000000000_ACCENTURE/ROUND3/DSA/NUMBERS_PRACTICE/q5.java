// Problem: Compute the factorial (N!) of a non-negative integer N.

import java.util.*;

class Solution5 {
    public long factorial(int n) {
        // Logic: Multiply all integers from 1 up to N. Use 'long' to prevent integer overflow.
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int n = 5; // Input
        long result = sol.factorial(n);
        System.out.println(result);
        // Output: 120
    }
}
