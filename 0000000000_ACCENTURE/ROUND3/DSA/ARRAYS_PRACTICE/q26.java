// Problem: Find an index where the sum of elements on its left equals the sum of elements on its right.

import java.util.*;

class Solution26 {
    public int pivotIndex(int[] nums) {
        // Logic: First compute the total sum of the array.
        // Walk through the array keeping a 'leftSum'. Right sum is (totalSum - leftSum - currentElement).
        // If leftSum equals rightSum, return that index.
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution26 sol = new Solution26();
        int[] nums = {1, 7, 3, 6, 5, 6}; // Input
        int result = sol.pivotIndex(nums);
        System.out.println(result);
        // Output: 3
    }
}
