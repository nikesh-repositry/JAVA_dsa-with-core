// Problem: Find all elements that are strictly greater than all elements to their right.

import java.util.*;

class Solution27 {
    public List<Integer> findLeaders(int[] nums) {
        // Logic: Scan the array from right to left while keeping track of 'maxFromRight'.
        // Any element greater than 'maxFromRight' is a leader. Reverse the list at the end to keep order.
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                leaders.add(nums[i]);
                maxFromRight = nums[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        Solution27 sol = new Solution27();
        int[] nums = {16, 17, 4, 3, 5, 2}; // Input
        List<Integer> result = sol.findLeaders(nums);
        System.out.println(result);
        // Output: [17, 5, 2]
    }
}
