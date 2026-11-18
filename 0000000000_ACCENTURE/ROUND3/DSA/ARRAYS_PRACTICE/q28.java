// Problem: Find the length of the longest sequence of consecutive integers in an unsorted array.

import java.util.*;

class Solution28 {
    public int longestConsecutive(int[] nums) {
        // Logic: Put all numbers into a HashSet for instant O(1) lookup.
        // Only start counting a streak if (num - 1) is NOT in the set (meaning 'num' is the start of a sequence).
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longestStreak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        Solution28 sol = new Solution28();
        int[] nums = {100, 4, 200, 1, 3, 2}; // Input
        int result = sol.longestConsecutive(nums);
        System.out.println(result);
        // Output: 4
    }
}
