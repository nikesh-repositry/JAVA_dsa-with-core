// Problem: Given an array of size N-1 containing distinct numbers from 1 to N, find the missing one.

import java.util.*;

class Solution12 {
    public int missingNumber(int[] nums, int n) {
        // Logic: The sum of numbers from 1 to N is always N * (N + 1) / 2.
        // Subtract the actual sum of array elements from this expected sum to get the missing number.
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        int[] nums = {1, 2, 4, 5, 6}; // Input array
        int n = 6; // Input N
        int result = sol.missingNumber(nums, n);
        System.out.println(result);
        // Output: 3
    }
}
