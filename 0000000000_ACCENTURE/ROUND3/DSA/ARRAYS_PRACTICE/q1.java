// Problem: Find and return the largest number in a given integer array.

import java.util.*;

class Solution1 {
    public int findLargest(int[] nums) {
        // Logic: Assume the first element is the largest.
        // Loop through the rest of the array and update 'max' whenever a bigger number is found.
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] nums = {12, 45, 7, 89, 23}; // Input
        int result = sol.findLargest(nums);
        System.out.println(result);
        // Output: 89
    }
}
