// Problem: Return an array containing all unique elements from both arrays combined.

import java.util.*;

class Solution18 {
    public int[] union(int[] nums1, int[] nums2) {
        // Logic: A HashSet automatically ignores duplicate values.
        // Add every element from both arrays into a single HashSet, then convert to an array.
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) set.add(num);
        for (int num : nums2) set.add(num);

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) result[i++] = num;
        return result;
    }

    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        int[] nums1 = {1, 2, 3, 4}; // Input 1
        int[] nums2 = {3, 4, 5, 6}; // Input 2
        int[] result = sol.union(nums1, nums2);
        System.out.println(Arrays.toString(result));
        // Output: [1, 2, 3, 4, 5, 6]
    }
}
