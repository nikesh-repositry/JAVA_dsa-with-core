/*
================================================================================
PROBLEM STATEMENT:
Coding Question 1: Running Sum and Divisibility Count

Given a positive integer N, calculate the running sum from 1 to N. Increment a 
counter every time the running sum is divisible by 5. Output the total running 
sum and final count.
================================================================================
*/

import java.util.Arrays;

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int[] runningSumAndDivisibilityCount(int N) {
        
        // WHAT: Create variables to track the running total and the divisibility counter.
        // HOW: Initialize runningSum = 0 and count = 0.
        // WHY: We need to add numbers one by one from 1 to N and count how many times 
        //      that running total is a multiple of 5.
        int runningSum = 0;
        int count = 0;

        // WHAT: Loop through every integer from 1 up to N.
        // HOW: Standard for-loop starting at i = 1 while i <= N.
        // WHY: The problem asks us to calculate the running sum starting from 1 through N.
        for (int i = 1; i <= N; i++) {
            
            // WHAT: Add the current number i to the running sum.
            // HOW: Use += to accumulate i into runningSum.
            // WHY: Updates the running sum at each step.
            runningSum += i;

            // WHAT: Check if the updated running sum is cleanly divisible by 5.
            // HOW: Use the modulo operator (runningSum % 5 == 0).
            // WHY: Remainder 0 means runningSum is divisible by 5, so we increment count.
            if (runningSum % 5 == 0) {
                count++;
            }
        }

        // WHAT: Return both the final running sum and the count together.
        // HOW: Pack them into a 2-element integer array: {runningSum, count}.
        // WHY: Java methods return a single value, so returning an array cleanly passes 
        //      both answers back to the caller.
        return new int[]{runningSum, count};
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Sample Input 1
        int N1 = 5;
        int[] output1 = obj.runningSumAndDivisibilityCount(N1);
        System.out.println("Input N = " + N1);
        System.out.println("Total Running Sum: " + output1 + ", Final Count: " + output1[1]);

        System.out.println("------------------------------------");

        // Sample Input 2
        int N2 = 10;
        int[] output2 = obj.runningSumAndDivisibilityCount(N2);
        System.out.println("Input N = " + N2);
        System.out.println("Total Running Sum: " + output2 + ", Final Count: " + output2[1]);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Sample 1:
Input : N = 5
Step-by-step calculation:
  - i = 1 -> runningSum = 1  (1 % 5 != 0)
  - i = 2 -> runningSum = 3  (3 % 5 != 0)
  - i = 3 -> runningSum = 6  (6 % 5 != 0)
  - i = 4 -> runningSum = 10 (10 % 5 == 0 -> count = 1)
  - i = 5 -> runningSum = 15 (15 % 5 == 0 -> count = 2)
Output: Total Running Sum = 15, Final Count = 2

--------------------------------------------------------------------------------

Sample 2:
Input : N = 10
Step-by-step calculation:
  - Divisible running sums occur at i = 4 (sum 10), i = 5 (sum 15), i = 9 (sum 45), i = 10 (sum 55).
Output: Total Running Sum = 55, Final Count = 4
================================================================================
*/
