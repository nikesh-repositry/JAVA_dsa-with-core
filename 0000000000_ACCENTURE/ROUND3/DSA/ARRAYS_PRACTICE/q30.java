// Problem: Find the contiguous subarray within an array that has the largest product.

import java.util.*;

class Solution30 {
    public int maxProduct(int[] nums) {
        // Logic: A negative number can turn the smallest negative product into the largest positive product.
        // So we track both 'maxProd' and 'minProd' at every step, swapping them if we hit a negative number.
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);
            result = Math.max(result, maxProd);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution30 sol = new Solution30();
        int[] nums = {2, 3, -2, 4}; // Input
        int result = sol.maxProduct(nums);
        System.out.println(result);
        // Output: 6
    }
}
