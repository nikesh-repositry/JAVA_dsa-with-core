// Problem: Find indices of two numbers in the array that add up to target K (Two Sum).

import java.util.*;

class Solution24 {
    public int[] twoSum(int[] nums, int target) {
        // Logic: Store each number and its index in a HashMap as we loop.
        // For each number, check if (target - currentNumber) already exists in the map.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Solution24 sol = new Solution24();
        int[] nums = {2, 7, 11, 15}; // Input array
        int k = 9; // Input target sum
        int[] result = sol.twoSum(nums, k);
        System.out.println(Arrays.toString(result));
        // Output: [0, 1]
    }
}
