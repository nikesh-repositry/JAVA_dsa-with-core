// Problem: Count the total positive, negative, and zero values in the array.

import java.util.*;

class Solution7 {
    public int[] countPosNegZero(int[] nums) {
        // Logic: Check each number against 0.
        // Greater than 0 is positive, less than 0 is negative, and equal to 0 is zero.
        int pos = 0, neg = 0, zero = 0;
        for (int num : nums) {
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else zero++;
        }
        return new int[]{pos, neg, zero};
    }

    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        int[] nums = {10, -5, 0, 23, -1, 0, 7}; // Input
        int[] result = sol.countPosNegZero(nums);
        System.out.println("Pos: " + result[0] + ", Neg: " + result[1] + ", Zero: " + result[2]);
        // Output: Pos: 3, Neg: 2, Zero: 2
    }
}
