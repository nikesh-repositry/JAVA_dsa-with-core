// Problem: Find the maximum difference (nums[j] - nums[i]) such that larger element appears after smaller (j > i).

import java.util.*;

class Solution19 {
    public int maxDifference(int[] nums) {
        // Logic: Track the smallest number seen so far ('minSoFar').
        // At each step, subtract 'minSoFar' from the current number and update 'maxDiff' if bigger.
        if (nums.length < 2) return 0;
        int minSoFar = nums[0];
        int maxDiff = nums[1] - nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxDiff = Math.max(maxDiff, nums[i] - minSoFar);
            minSoFar = Math.min(minSoFar, nums[i]);
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        int[] nums = {2, 3, 10, 6, 4, 8, 1}; // Input
        int result = sol.maxDifference(nums);
        System.out.println(result);
        // Output: 8
    }
}
