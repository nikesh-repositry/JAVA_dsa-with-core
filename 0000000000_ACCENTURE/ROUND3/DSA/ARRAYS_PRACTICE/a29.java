// Problem: Find the start and end indices (0-based) of a contiguous subarray that adds up to target sum S (positive numbers).

import java.util.*;

class Solution29 {
    public int[] subarraySum(int[] nums, int target) {
        // Logic: Use a sliding window with 'left' and 'right' pointers.
        // Expand 'right' to add numbers to currentSum. If currentSum exceeds target, shrink from 'left'.
        int left = 0, currentSum = 0;
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum > target && left < right) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum == target) {
                return new int[]{left, right};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Solution29 sol = new Solution29();
        int[] nums = {1, 4, 20, 3, 10, 5}; // Input array
        int target = 33; // Input sum
        int[] result = sol.subarraySum(nums, target);
        System.out.println(Arrays.toString(result));
        // Output: [2, 4]
    }
}
