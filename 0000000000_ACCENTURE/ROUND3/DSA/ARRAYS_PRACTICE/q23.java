// Problem: Find the element that appears more than N/2 times in the array (Boyer-Moore Voting Algorithm).

import java.util.*;

class Solution23 {
    public int majorityElement(int[] nums) {
        // Logic: Maintain a 'candidate' and a 'count'.
        // If count hits 0, pick the current number as the new candidate.
        // Add 1 if the current number matches candidate, else subtract 1. The majority element always survives.
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        int[] nums = {2, 2, 1, 1, 1, 2, 2}; // Input
        int result = sol.majorityElement(nums);
        System.out.println(result);
        // Output: 2
    }
}
