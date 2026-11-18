// Problem: Move all 0s to the end of the array while keeping the relative order of non-zero elements.

import java.util.*;

class Solution15 {
    public void moveZeroes(int[] nums) {
        // Logic: Keep an 'insertPos' pointer for where the next non-zero number should go.
        // First, shift all non-zero numbers to the front. Then fill the remaining slots with 0.
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        int[] nums = {0, 1, 0, 3, 12}; // Input
        sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        // Output: [1, 3, 12, 0, 0]
    }
}
