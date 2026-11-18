/*
================================================================================
PROBLEM STATEMENT:
Given an array of integers of length N (N >= 3), a local peak is defined as an 
element that is strictly greater than both its immediate left and right neighbors. 
A local valley is defined as an element that is strictly less than both its 
immediate left and right neighbors.

Perform the following steps:
  1. Count the total number of local peaks (peaks) and local valleys (valleys) 
     across the array (Note: elements at the very beginning and very end of the 
     array cannot be peaks or valleys).
  2. Compute the product: Product = peaks * valleys.
  3. If Product is a two-digit or larger number, find its remainder when divided 
     by 7. If it's a single digit, keep it as is.

Return the final integer result.

Constraints:
  - 3 <= N <= 100
  - Each element is between -1000 and 1000.

Example:
Input: [1, 3, 2, 5, 4, 6, 2]
================================================================================
*/

import java.util.Arrays;

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int peaksAndValleysProduct(int[] nums) {
        
        // WHAT: Create counters for local peaks and local valleys.
        // HOW: Initialize peaks = 0 and valleys = 0.
        // WHY: Step 1 asks us to count the total number of peaks and valleys in the array.
        int peaks = 0;
        int valleys = 0;

        // WHAT: Loop through all interior elements from index 1 to N - 2.
        // HOW: Standard for-loop starting at i = 1 while i < nums.length - 1.
        // WHY: The first element (index 0) and last element (index N - 1) do not have 
        //      both left and right neighbors, so they cannot be peaks or valleys.
        for (int i = 1; i < nums.length - 1; i++) {
            
            // WHAT: Check if nums[i] is a local peak.
            // HOW: Verify nums[i] > nums[i - 1] AND nums[i] > nums[i + 1].
            // WHY: A local peak must be strictly greater than both immediate neighbors.
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                peaks++;
            }
            // WHAT: Check if nums[i] is a local valley.
            // HOW: Verify nums[i] < nums[i - 1] AND nums[i] < nums[i + 1].
            // WHY: A local valley must be strictly less than both immediate neighbors.
            else if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                valleys++;
            }
        }

        // WHAT: Multiply the total count of peaks and valleys.
        // HOW: Store peaks * valleys inside an integer variable named product.
        // WHY: Directly performs Step 2 of the problem statement.
        int product = peaks * valleys;

        // WHAT: Apply Step 3 rule based on whether product has two or more digits.
        // HOW: Check if (product >= 10); if true, return (product % 7), else return product.
        // WHY: Since peaks and valleys are non-negative counts, any number >= 10 is a 
        //      two-digit or larger number, while 0 to 9 are single digits.
        if (product >= 10) {
            return product % 7;
        }

        return product;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Example from the problem image (Single-digit product case)
        int[] input1 = {1, 3, 2, 5, 4, 6, 2};
        int output1 = obj.peaksAndValleysProduct(input1);
        System.out.println("Sample 1 Input : " + Arrays.toString(input1));
        System.out.println("Sample 1 Output: " + output1);

        System.out.println("------------------------------------");

        // Sample Test Case 2 (Two-digit product >= 10 case)
        int[] input2 = {1, 5, 2, 6, 1, 7, 2, 8, 1};
        int output2 = obj.peaksAndValleysProduct(input2);
        System.out.println("Sample 2 Input : " + Arrays.toString(input2));
        System.out.println("Sample 2 Output: " + output2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Sample 1 (From Image):
Input : nums = [1, 3, 2, 5, 4, 6, 2]
Step-by-step calculation:
  - Index 1 (3): 1 < 3 > 2 -> Peak (peaks = 1)
  - Index 2 (2): 3 > 2 < 5 -> Valley (valleys = 1)
  - Index 3 (5): 2 < 5 > 4 -> Peak (peaks = 2)
  - Index 4 (4): 5 > 4 < 6 -> Valley (valleys = 2)
  - Index 5 (6): 4 < 6 > 2 -> Peak (peaks = 3)
  - Product = 3 * 2 = 6 (single digit -> keep as is)
Output: 6

--------------------------------------------------------------------------------

Sample 2:
Input : nums = [1, 5, 2, 6, 1, 7, 2, 8, 1]
Step-by-step calculation:
  - Peaks at indices 1, 3, 5, 7 -> peaks = 4
  - Valleys at indices 2, 4, 6 -> valleys = 3
  - Product = 4 * 3 = 12 (two-digit number >= 10 -> 12 % 7 = 5)
Output: 5
================================================================================
*/
