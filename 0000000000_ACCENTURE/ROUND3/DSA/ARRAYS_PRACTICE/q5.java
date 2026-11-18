// Problem: Calculate and return the total sum of all elements in the array.

import java.util.*;

class Solution5 {
    public int arraySum(int[] nums) {
        // Logic: Start a sum variable at 0.
        // Visit each element in the array and add its value to sum.
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int[] nums = {1, 2, 3, 4, 5}; // Input
        int result = sol.arraySum(nums);
        System.out.println(result);
        // Output: 15
    }
}
