// Problem: Remove duplicates in-place from a sorted array and return the count of unique elements.

import java.util.*;

class Solution11 {
    public int removeDuplicates(int[] nums) {
        // Logic: Use a slow pointer 'i' to track the position of unique elements.
        // Use a fast pointer 'j' to scan ahead. Whenever nums[j] differs from nums[i],
        // move 'i' forward and copy nums[j] into nums[i].
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        int[] nums = {1, 1, 2, 2, 3, 4, 4}; // Input
        int uniqueCount = sol.removeDuplicates(nums);
        System.out.println("Count: " + uniqueCount + ", Array: " + Arrays.toString(Arrays.copyOf(nums, uniqueCount)));
        // Output: Count: 4, Array: [1, 2, 3, 4]
    }
}
