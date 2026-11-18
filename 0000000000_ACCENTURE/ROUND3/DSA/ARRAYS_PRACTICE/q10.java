// Problem: Count how many times a specific target value appears in the array.

import java.util.*;

class Solution10 {
    public int findFrequency(int[] nums, int target) {
        // Logic: Loop through every element in the array.
        // Every time an element matches 'target', increase the counter by 1.
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        int[] nums = {2, 5, 2, 8, 2, 9}; // Input array
        int target = 2; // Input target
        int result = sol.findFrequency(nums, target);
        System.out.println(result);
        // Output: 3
    }
}
