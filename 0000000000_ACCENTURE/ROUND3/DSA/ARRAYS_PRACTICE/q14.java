// Problem: Return a list of all elements that appear more than once in the array.

import java.util.*;

class Solution14 {
    public List<Integer> findAllDuplicates(int[] nums) {
        // Logic: Use two HashSets: 'seen' to track numbers we've encountered,
        // and 'duplicates' to store numbers seen more than once without adding them twice.
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; // Input
        List<Integer> result = sol.findAllDuplicates(nums);
        System.out.println(result);
        // Output: [2, 3]
    }
}
