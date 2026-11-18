// Problem: Rotate the elements of the array to the left by K positions in-place.

import java.util.*;

class Solution21 {
    public void rotateLeft(int[] nums, int k) {
        // Logic: Normalize K using k % n.
        // Reverse the first K elements, reverse the remaining N-K elements, then reverse the whole array.
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
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
        Solution21 sol = new Solution21();
        int[] nums = {1, 2, 3, 4, 5}; // Input array
        int k = 2; // Input K
        sol.rotateLeft(nums, k);
        System.out.println(Arrays.toString(nums));
        // Output: [3, 4, 5, 1, 2]
    }
}
