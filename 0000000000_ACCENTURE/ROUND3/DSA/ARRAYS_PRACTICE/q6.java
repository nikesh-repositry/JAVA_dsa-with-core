// Problem: Count how many even and odd numbers exist in the array.

import java.util.*;

class Solution6 {
    public int[] countEvenOdd(int[] nums) {
        // Logic: A number is even if dividing it by 2 leaves a remainder of 0 (num % 2 == 0).
        // Otherwise, it is odd. Increment respective counters and return both in an array.
        int even = 0, odd = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int[] nums = {1, 2, 3, 4, 5, 6}; // Input
        int[] result = sol.countEvenOdd(nums);
        System.out.println("Even: " + result[0] + ", Odd: " + result[1]);
        // Output: Even: 3, Odd: 3
    }
}
