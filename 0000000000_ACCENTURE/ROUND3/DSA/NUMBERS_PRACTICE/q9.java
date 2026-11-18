// Problem: Return true if a positive integer num is a perfect square without using Math.sqrt().

import java.util.*;

class Solution9 {
    public boolean isPerfectSquare(int num) {
        // Logic: Use Binary Search from 1 to num. If mid * mid equals num, return true.
        if (num < 1) return false;
        long left = 1, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;
            if (sq == num) return true;
            else if (sq < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int num = 49; // Input
        boolean result = sol.isPerfectSquare(num);
        System.out.println(result);
        // Output: true
    }
}
