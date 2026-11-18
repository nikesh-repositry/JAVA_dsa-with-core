// Problem: Reverse the given array in-place without using extra array space.

import java.util.*;

class Solution8 {
    public void reverseArray(int[] nums) {
        // Logic: Use two pointers, 'left' at start and 'right' at end.
        // Swap elements at left and right, then move both pointers inward until they meet.
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int[] nums = {1, 2, 3, 4, 5}; // Input
        sol.reverseArray(nums);
        System.out.println(Arrays.toString(nums));
        // Output: [5, 4, 3, 2, 1]
    }
}
