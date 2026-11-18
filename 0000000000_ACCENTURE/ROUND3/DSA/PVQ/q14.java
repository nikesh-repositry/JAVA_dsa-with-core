/*
================================================================================
PROBLEM STATEMENT:
Given an array of exactly 6 integers [i1, i2, i3, i4, i5, i6], perform absolute 
pairwise subtractions between sequential non-overlapping pairs:
  diff1 = | i1 - i2 |
  diff2 = | i3 - i4 |
  diff3 = | i5 - i6 |

Next, compute the total sum: Sum = diff1 + diff2 + diff3. 
If Sum >= 10, repeatedly calculate the sum of its digits until a single digit 
(0 - 9) is obtained.
================================================================================
*/

import java.util.Arrays;

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int pairwiseDiffDigitalRoot(int[] nums) {
        
        // WHAT: Calculate the absolute differences of the 3 non-overlapping pairs.
        // HOW: Use Math.abs() on indices (0, 1), (2, 3), and (4, 5).
        // WHY: Array indexing is 0-based, so [i1..i6] corresponds to indices [0..5].
        int diff1 = Math.abs(nums[0] - nums[1]);
        int diff2 = Math.abs(nums[2] - nums[3]);
        int diff3 = Math.abs(nums[4] - nums[5]);

        // WHAT: Add all three pairwise differences together.
        // HOW: Store diff1 + diff2 + diff3 inside totalSum.
        // WHY: Gives us the initial sum before reducing it to a single digit.
        int totalSum = diff1 + diff2 + diff3;

        // WHAT: Repeatedly sum the digits of totalSum until it becomes a single digit (0 - 9).
        // HOW: Keep looping while (totalSum >= 10), adding each digit via (% 10) and (/ 10).
        // WHY: Ensures any multi-digit sum (like 14) reduces down to a single digit (1 + 4 = 5).
        while (totalSum >= 10) {
            int digitSum = 0;

            while (totalSum > 0) {
                digitSum += totalSum % 10;
                totalSum /= 10;
            }

            totalSum = digitSum;
        }

        return totalSum;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Sample Test Case 1: Sum >= 10 (requires digit reduction)
        int[] input1 = {10, 4, 2, 9, 15, 11};
        int output1 = obj.pairwiseDiffDigitalRoot(input1);
        System.out.println("Sample 1 Input : " + Arrays.toString(input1));
        System.out.println("Sample 1 Output: " + output1);

        System.out.println("------------------------------------");

        // Sample Test Case 2: Sum < 10 (already a single digit)
        int[] input2 = {5, 3, 8, 6, 4, 1};
        int output2 = obj.pairwiseDiffDigitalRoot(input2);
        System.out.println("Sample 2 Input : " + Arrays.toString(input2));
        System.out.println("Sample 2 Output: " + output2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Sample 1:
Input : nums = [10, 4, 2, 9, 15, 11]
Step-by-step calculation:
  - diff1 = |10 - 4|  = 6
  - diff2 = |2 - 9|   = 7
  - diff3 = |15 - 11| = 4
  - Sum = 6 + 7 + 4 = 17
  - Since 17 >= 10 -> 1 + 7 = 8
Output: 8

--------------------------------------------------------------------------------

Sample 2:
Input : nums = [5, 3, 8, 6, 4, 1]
Step-by-step calculation:
  - diff1 = |5 - 3| = 2
  - diff2 = |8 - 6| = 2
  - diff3 = |4 - 1| = 3
  - Sum = 2 + 2 + 3 = 7 (already < 10)
Output: 7
================================================================================
*/
