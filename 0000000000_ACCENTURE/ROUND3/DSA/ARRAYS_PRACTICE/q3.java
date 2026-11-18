// Problem: Find the second largest distinct element in the array. Return -1 if it does not exist.

import java.util.*;

class Solution3 {
    public int findSecondLargest(int[] nums) {
        // Logic: Keep track of two variables: 'largest' and 'secondLargest'.
        // If we find a new largest, the old largest becomes the second largest.
        // If a number is smaller than largest but bigger than secondLargest, update secondLargest.
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[] nums = {12, 35, 1, 10, 34, 1}; // Input
        int result = sol.findSecondLargest(nums);
        System.out.println(result);
        // Output: 34
    }
}
