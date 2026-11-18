// Problem: Find the single duplicate number in an array where numbers repeat.

import java.util.*;

class Solution13 {
    public int findDuplicate(int[] nums) {
        // Logic: Store visited numbers in a HashSet.
        // Before adding a number, check if it is already in the set. If yes, we found the duplicate.
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        int[] nums = {3, 1, 3, 4, 2}; // Input
        int result = sol.findDuplicate(nums);
        System.out.println(result);
        // Output: 3
    }
}
