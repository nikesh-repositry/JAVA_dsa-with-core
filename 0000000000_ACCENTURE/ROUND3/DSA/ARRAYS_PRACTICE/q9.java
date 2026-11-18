// Problem: Create a new array and copy all elements from the source array into it.

import java.util.*;

class Solution9 {
    public int[] copyArray(int[] nums) {
        // Logic: Create a new array of the exact same length as the input array.
        // Loop through each index and copy the value from source to destination.
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int[] nums = {10, 20, 30, 40}; // Input
        int[] result = sol.copyArray(nums);
        System.out.println(Arrays.toString(result));
        // Output: [10, 20, 30, 40]
    }
}
