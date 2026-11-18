// Problem: Find and return the smallest number in a given integer array.

import java.util.*;

class Solution2 {
    public int findSmallest(int[] nums) {
        // Logic: Assume the first element is the smallest.
        // Walk through the array and update 'min' whenever a smaller number appears.
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] nums = {12, 45, 7, 89, 23}; // Input
        int result = sol.findSmallest(nums);
        System.out.println(result);
        // Output: 7
    }
}
