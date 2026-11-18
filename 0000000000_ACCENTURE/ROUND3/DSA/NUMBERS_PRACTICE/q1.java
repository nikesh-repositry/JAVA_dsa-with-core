// Problem: Reverse the digits of a given integer (return 0 if it overflows 32-bit integer range).

import java.util.*;

class Solution1 {
    public int reverseNumber(int x) {
        // Logic: Extract the last digit using (x % 10) and build the reversed number by multiplying by 10.
        // Divide x by 10 in each step until x becomes 0.
        long rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return (int) rev;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int x = 12345; // Input
        int result = sol.reverseNumber(x);
        System.out.println(result);
        // Output: 54321
    }
}
