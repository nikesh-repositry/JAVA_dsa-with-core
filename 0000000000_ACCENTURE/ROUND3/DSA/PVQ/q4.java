/*
================================================================================
PROBLEM STATEMENT:
Given an array of integers nums, perform the following transformation on each 
element based on its 0-based index i:
  1. Subtract (i % 7) * 3 from the element.
  2. If the original element nums[i] is divisible by 11, add nums[i] / 11 to the 
     modified value.
Return the total sum of all elements in the array after applying these 
transformations.
================================================================================
*/

import java.util.Arrays;

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int transformAndSum(int[] nums) {
        
        // WHAT: Create a variable to store the running total of all transformed elements.
        // HOW: Initialize totalSum = 0.
        // WHY: We need to return the sum of all modified values at the end, and adding 
        //      them inside the loop avoids needing an extra array.
        int totalSum = 0;

        // WHAT: Loop through every element in the array using its 0-based index i.
        // HOW: Standard for-loop from i = 0 up to nums.length - 1.
        // WHY: Both transformation rules depend on the current index i and original value nums[i].
        for (int i = 0; i < nums.length; i++) {
            
            // WHAT: Save the original value of the current element before changing it.
            // HOW: Store nums[i] inside a local variable named original.
            // WHY: Rule 2 specifically checks if the ORIGINAL element is divisible by 11, 
            //      not the value after subtracting in Rule 1.
            int original = nums[i];

            // WHAT: Apply Rule 1 by subtracting (i % 7) * 3 from the element.
            // HOW: Calculate modified = original - ((i % 7) * 3).
            // WHY: Directly follows the first step of the transformation formula.
            int modified = original - ((i % 7) * 3);

            // WHAT: Apply Rule 2 if the original element is cleanly divisible by 11.
            // HOW: Check if (original % 11 == 0), and if true, add (original / 11) to modified.
            // WHY: Only multiples of 11 (including 0) get the bonus quotient added.
            if (original % 11 == 0) {
                modified += (original / 11);
            }

            // WHAT: Add the final transformed value of this element to totalSum.
            // HOW: Use += to accumulate modified into totalSum.
            // WHY: Keeps a running sum across the whole array.
            totalSum += modified;
        }

        return totalSum;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Test Case 1 from the problem image
        int[] nums1 = {22, 5, 14};
        int output1 = obj.transformAndSum(nums1);
        System.out.println("Test Case 1 Input : " + Arrays.toString(nums1));
        System.out.println("Test Case 1 Output: " + output1);

        System.out.println("------------------------------------");

        // Test Case 2 from the problem image
        int[] nums2 = {0, 11, 33, 7, 0};
        int output2 = obj.transformAndSum(nums2);
        System.out.println("Test Case 2 Input : " + Arrays.toString(nums2));
        System.out.println("Test Case 2 Output: " + output2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Test Case 1 (From Image):
Input : nums = [22, 5, 14]
Step-by-step calculation:
  - Index 0 (22): 22 - (0 % 7)*3 = 22. Divisible by 11 -> 22 + (22/11) = 24
  - Index 1 (5) : 5  - (1 % 7)*3 = 2.  Not divisible by 11 -> 2
  - Index 2 (14): 14 - (2 % 7)*3 = 8.  Not divisible by 11 -> 8
Output: 34  (24 + 2 + 8)

--------------------------------------------------------------------------------

Test Case 2 (From Image):
Input : nums = [0, 11, 33, 7, 0]
Step-by-step calculation:
  - Index 0 (0) : 0  - 0  + (0/11)  = 0
  - Index 1 (11): 11 - 3  + (11/11) = 9
  - Index 2 (33): 33 - 6  + (33/11) = 30
  - Index 3 (7) : 7  - 9  + 0       = -2
  - Index 4 (0) : 0  - 12 + (0/11)  = -12
Output: 25  (0 + 9 + 30 - 2 - 12)
================================================================================
*/
