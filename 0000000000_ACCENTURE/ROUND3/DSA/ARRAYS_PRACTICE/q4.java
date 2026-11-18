// Problem: Find the second smallest distinct element in the array. Return -1 if it does not exist.

import java.util.*;

class Solution4 {
    public int findSecondSmallest(int[] nums) {
        // Logic: Track 'smallest' and 'secondSmallest'.
        // When a new smallest is found, demote the current smallest to secondSmallest.
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return (secondSmallest == Integer.MAX_VALUE) ? -1 : secondSmallest;
    }

    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        int[] nums = {12, 13, 1, 10, 34, 1}; // Input
        int result = sol.findSecondSmallest(nums);
        System.out.println(result);
        // Output: 10
    }
}
