/*
================================================================================
PROBLEM STATEMENT:
Mountain Trail Elevation (Max Bitonic Subarray Sum)

A person is travelling along a mountain trail and records the elevation at each 
checkpoint in an array A of size N.

A valid mountain route must follow these strict rules:
- Must be a contiguous subarray of checkpoints.
- Elevation must strictly increase while moving toward the peak.
- At one checkpoint, the person reaches the peak.
- After the peak, elevation must strictly decrease.
- Must contain at least 3 checkpoints (at least 1 step up and 1 step down).

Task: Find the maximum possible sum of elevations in any valid mountain route. 
If no valid route exists, return 0.
================================================================================
*/

import java.util.Arrays;

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int maxMountainSum(int N, int[] A) {
        
        // WHAT: Check if the array is too small to form a mountain.
        // HOW: Return 0 immediately if N < 3.
        // WHY: A valid mountain needs at least 3 checkpoints (up, peak, down).
        if (N < 3) {
            return 0;
        }

        // WHAT: Track the maximum valid mountain sum found so far.
        // HOW: Initialize maxSum = 0.
        // WHY: If no valid mountain exists, we must return 0.
        int maxSum = 0;

        // WHAT: Loop through every possible checkpoint i to treat it as the "peak".
        // HOW: Loop i from 1 to N - 2.
        // WHY: A peak cannot be at index 0 (needs at least 1 step up on the left) 
        //      or index N - 1 (needs at least 1 step down on the right).
        for (int i = 1; i <= N - 2; i++) {

            // WHAT: Check if index i is actually a peak (higher than both neighbors).
            // HOW: Verify A[i - 1] < A[i] AND A[i] > A[i + 1].
            // WHY: Only a local peak can have at least 1 strictly increasing step before 
            //      it and 1 strictly decreasing step after it.
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                
                // Start the current mountain sum with the peak's elevation
                int currentSum = A[i];

                // WHAT: Walk backwards from the peak to add all strictly increasing elevations.
                // HOW: Use a left pointer starting at i and move left while A[left - 1] < A[left].
                // WHY: We want to include the entire upward slope leading to this peak.
                int left = i;
                while (left > 0 && A[left - 1] < A[left]) {
                    left--;
                    currentSum += A[left];
                }

                // WHAT: Walk forwards from the peak to add all strictly decreasing elevations.
                // HOW: Use a right pointer starting at i and move right while A[right] > A[right + 1].
                // WHY: We want to include the entire downward slope leaving this peak.
                int right = i;
                while (right < N - 1 && A[right] > A[right + 1]) {
                    right++;
                    currentSum += A[right];
                }

                // WHAT: Update maxSum if this mountain route has a higher total elevation.
                // HOW: Use Math.max(maxSum, currentSum).
                // WHY: Keeps track of the best mountain route across all peaks.
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Test Case 1 from the problem image
        int N1 = 9;
        int[] A1 = {2, 4, 6, 9, 7, 5, 3, 1, 4};
        int output1 = obj.maxMountainSum(N1, A1);
        System.out.println("Test Case 1 Input : N = " + N1 + ", A = " + Arrays.toString(A1));
        System.out.println("Test Case 1 Output: " + output1);

        System.out.println("------------------------------------");

        // Test Case 2: No valid mountain (strictly increasing only)
        int N2 = 4;
        int[] A2 = {1, 2, 3, 4};
        int output2 = obj.maxMountainSum(N2, A2);
        System.out.println("Test Case 2 Input : N = " + N2 + ", A = " + Arrays.toString(A2));
        System.out.println("Test Case 2 Output: " + output2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Test Case 1 (From Image):
Input : N = 9, A =
Step-by-step check:
  - Peak found at index 3 (value 9) because 6 < 9 and 9 > 7.
  - Expand left (strictly increasing): 6, 4, 2 -> adds 12.
  - Expand right (strictly decreasing): 7, 5, 3, 1 -> adds 16 (stops before 4).
  - Total mountain sum = 2 + 4 + 6 + 9 + 7 + 5 + 3 + 1 = 37.
Output: 37

--------------------------------------------------------------------------------

Test Case 2 (No Valid Mountain):
Input : N = 4, A =
Step-by-step check:
  - No element has both a smaller left neighbor and a smaller right neighbor.
Output: 0
================================================================================
*/
