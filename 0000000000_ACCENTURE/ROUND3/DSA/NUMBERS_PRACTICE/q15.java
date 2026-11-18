// Problem: Convert a decimal integer to its binary string representation without built-in shortcuts.

import java.util.*;

class Solution15 {
    public String decimalToBinary(int n) {
        // Logic: Repeatedly divide n by 2 and record the remainder (0 or 1).
        // Reverse the collected remainders at the end.
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        int n = 13; // Input
        String result = sol.decimalToBinary(n);
        System.out.println(result);
        // Output: 1101
    }
}
