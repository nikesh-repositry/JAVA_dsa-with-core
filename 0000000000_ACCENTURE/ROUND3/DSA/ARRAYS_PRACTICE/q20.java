// Problem: Find the contiguous subarray which has the largest sum (Kadane's Algorithm).

import java.util.*;

class Solution20 {
    public int maxSubArray(int[] nums) {
        // Logic: Keep adding elements to 'currentSum'.
        // If 'currentSum' drops below 0, reset it to 0 because a negative sum will only hurt future subarrays.
        // Track the highest sum seen in 'maxSum'.
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Input
        int result = sol.maxSubArray(nums);
        System.out.println(result);
        // Output: 6
    }
}
