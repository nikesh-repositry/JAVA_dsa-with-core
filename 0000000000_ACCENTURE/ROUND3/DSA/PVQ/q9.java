/*
================================================================================
PROBLEM STATEMENT:
Robot Energy Peak Route

A robot travels through a series of checkpoints where each checkpoint has an 
associated energy value.

Valid Energy Route Requirements:
- Route consists of consecutive checkpoints (contiguous subarray).
- Energy values strictly increase while moving toward a peak checkpoint.
- After reaching the highest energy value (peak), energy values strictly decrease.
- Route must contain at least 3 checkpoints.

Goal: Output the maximum sum of energy values along any valid bitonic energy route.
(Note: Uses the Two-Pointer Single-Pass Strategy).
================================================================================
*/

import java.util.Arrays;

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int maxEnergyPeakRoute(int[] energy) {
        int n = energy.length;

        // WHAT: Check if there are enough checkpoints to form a peak route.
        // HOW: Return 0 immediately if n < 3.
        // WHY: A valid route needs at least 3 checkpoints (upward step, peak, downward step).
        if (n < 3) {
            return 0;
        }

        // WHAT: Track the maximum energy sum found across all valid routes and our current index.
        // HOW: Initialize maxSum = 0 and pointer i = 0.
        // WHY: We will scan the array in a single pass using pointer i to trace full mountains.
        int maxSum = 0;
        int i = 0;

        // WHAT: Loop through the array to find increasing-then-decreasing mountain routes.
        // HOW: Walk pointer i from 0 up to n - 2.
        // WHY: Each iteration tries to climb up from index i and slide down the other side.
        while (i < n - 1) {
            
            // WHAT: Save the starting index of the potential mountain route.
            // HOW: Set start = i and initialize currentSum = energy[i].
            // WHY: Keeping 'start' lets us verify later that we actually climbed at least 1 step.
            int start = i;
            int currentSum = energy[i];

            // WHAT: Climb up the strictly increasing slope toward the peak.
            // HOW: Advance i while energy[i] < energy[i + 1], adding each next value to currentSum.
            // WHY: Captures the entire upward side of the bitonic route in one go.
            while (i < n - 1 && energy[i] < energy[i + 1]) {
                i++;
                currentSum += energy[i];
            }

            // WHAT: Save the index where the upward climb stopped (our candidate peak).
            // HOW: Set peak = i.
            // WHY: We must check that we climbed up (peak > start) before sliding down.
            int peak = i;

            // WHAT: Slide down the strictly decreasing slope after the peak.
            // HOW: Advance i while energy[i] > energy[i + 1], adding each next value to currentSum.
            // WHY: Captures the entire downward side of the bitonic route.
            while (i < n - 1 && energy[i] > energy[i + 1]) {
                i++;
                currentSum += energy[i];
            }

            // WHAT: Verify that we had both a strictly increasing climb AND a strictly decreasing drop.
            // HOW: Check if (peak > start) AND (i > peak).
            // WHY: If both are true, the route has at least 3 checkpoints and is a valid bitonic peak.
            if (peak > start && i > peak) {
                maxSum = Math.max(maxSum, currentSum);
            }

            // WHAT: Handle flat/plateau checkpoints so the loop never gets stuck.
            // HOW: If i did not move at all (i == start), increment i by 1.
            // WHY: When energy[i] == energy[i + 1], neither while-loop runs, so i++ moves past the flat spot.
            if (i == start) {
                i++;
            }
        }

        return maxSum;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Sample Test Case 1: Valid bitonic route in the middle
        int[] energy1 = {2, 4, 6, 9, 7, 5, 3, 1, 4};
        int output1 = obj.maxEnergyPeakRoute(energy1);
        System.out.println("Sample 1 Input : " + Arrays.toString(energy1));
        System.out.println("Sample 1 Output: " + output1);

        System.out.println("------------------------------------");

        // Sample Test Case 2: Multiple peaks (chooses the route with larger sum)
        int[] energy2 = {1, 5, 2, 3, 10, 8, 4};
        int output2 = obj.maxEnergyPeakRoute(energy2);
        System.out.println("Sample 2 Input : " + Arrays.toString(energy2));
        System.out.println("Sample 2 Output: " + output2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Sample 1:
Input : energy =
Step-by-step trace:
  - Starts at index 0 (2), climbs up: 2 -> 4 -> 6 -> 9 (peak at index 3).
  - Slides down: 9 -> 7 -> 5 -> 3 -> 1 (ends at index 7).
  - Valid route =, sum = 37.
  - Next starts at index 7 (1), climbs to 4 (no downward slope), stops.
Output: 37

--------------------------------------------------------------------------------

Sample 2:
Input : energy =
Step-by-step trace:
  - First peak route:= 8
  - Second peak route:= 27
Output: 27
================================================================================
*/
