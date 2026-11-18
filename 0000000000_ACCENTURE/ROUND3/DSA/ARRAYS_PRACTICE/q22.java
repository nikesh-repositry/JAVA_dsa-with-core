// Problem: Rotate the elements of the array to the right by K positions in-place.

import java.util.*;

class Solution22 {
    public void rotateRight(int[] nums, int k) {
        // Logic: Normalize K using k % n.
        // Reverse the entire array first, then reverse the first K elements, and finally reverse the rest.
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution22 sol = new Solution22();
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // Input array
        int k = 3; // Input K
        sol.rotateRight(nums, k);
        System.out.println(Arrays.toString(nums));
        // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}
