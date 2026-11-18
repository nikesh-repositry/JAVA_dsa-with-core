// Problem: Rearrange the array so all negative numbers appear on the left side.

import java.util.*;

class Solution16 {
    public void moveNegatives(int[] nums) {
        // Logic: Use a pointer 'left' to track the boundary for negative numbers.
        // Whenever a negative number is found, swap it with the element at 'left' and move 'left' forward.
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        int[] nums = {-12, 11, -13, -5, 6, -7, 5, -3, -6}; // Input
        sol.moveNegatives(nums);
        System.out.println(Arrays.toString(nums));
        // Output: [-12, -13, -5, -7, -3, -6, 5, 6, 11]
    }
}
