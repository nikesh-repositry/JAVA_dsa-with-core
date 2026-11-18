// Problem: Return an array of unique elements that are present in both input arrays.

import java.util.*;

class Solution17 {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Logic: Add all elements of the first array into a HashSet.
        // Check each element of the second array against this set; if present, add to resultSet.
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) set1.add(num);

        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) result[i++] = num;
        return result;
    }

    public static void main(String[] args) {
        Solution17 sol = new Solution17();
        int[] nums1 = {4, 9, 5}; // Input 1
        int[] nums2 = {9, 4, 9, 8, 4}; // Input 2
        int[] result = sol.intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
        // Output: [4, 9]
    }
}
