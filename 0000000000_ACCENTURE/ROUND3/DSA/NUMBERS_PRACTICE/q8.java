// Problem: Compute and return the integer part of the square root of a non-negative integer x.

import java.util.*;

class Solution8 {
    public int mySqrt(int x) {
        // Logic: Use Binary Search between 1 and x.
        // If mid * mid <= x, store mid as a potential answer and search the right half for a larger value.
        if (x < 2) return x;
        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int x = 28; // Input
        int result = sol.mySqrt(x);
        System.out.println(result);
        // Output: 5
    }
}
