/*
================================================================================
PROBLEM STATEMENT:
Square Last Digit Match (Coins Problem)

Given two integer inputs N and D. Iterate through all numbers from 1 to N, 
calculate the square of each number, and determine whether the last digit of 
the square is equal to D.

Task:
Count and return the total number of integers in the range [1, N] whose square 
ends with digit D.
================================================================================
*/

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int countSquareLastDigitMatch(int N, int D) {
        
        // WHAT: Create a counter to track how many numbers have a square ending in D.
        // HOW: Initialize count = 0.
        // WHY: We need to return the total count of matching integers in the range [1, N].
        int count = 0;

        // WHAT: Loop through every integer i from 1 up to N.
        // HOW: Standard for-loop starting at i = 1 while i <= N.
        // WHY: The problem instructs us to check every integer in the inclusive range [1, N].
        for (int i = 1; i <= N; i++) {
            
            // WHAT: Calculate the square of the current number i using long to prevent overflow.
            // HOW: Cast i to long and multiply (long) i * i.
            // WHY: If N is large (e.g., 100,000), i * i would overflow a standard 32-bit int.
            long square = (long) i * i;

            // WHAT: Extract the last digit of the square and check if it equals D.
            // HOW: Use modulo 10 (square % 10) to get the ones-place digit and compare with D.
            // WHY: Dividing any positive integer by 10 leaves its rightmost (last) digit as remainder.
            if (square % 10 == D) {
                count++;
            }
        }

        return count;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Example Walkthrough from the problem image
        int N1 = 5;
        int D1 = 9;
        int output1 = obj.countSquareLastDigitMatch(N1, D1);
        System.out.println("Sample 1 Input : N = " + N1 + ", D = " + D1);
        System.out.println("Sample 1 Output: " + output1);

        System.out.println("------------------------------------");

        // Sample Test Case 2
        int N2 = 10;
        int D2 = 4;
        int output2 = obj.countSquareLastDigitMatch(N2, D2);
        System.out.println("Sample 2 Input : N = " + N2 + ", D = " + D2);
        System.out.println("Sample 2 Output: " + output2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Sample 1 (From Image):
Input : N = 5, D = 9
Step-by-step check:
  - 1^2 = 1  -> last digit 1
  - 2^2 = 4  -> last digit 4
  - 3^2 = 9  -> last digit 9 (MATCH! Count = 1)
  - 4^2 = 16 -> last digit 6
  - 5^2 = 25 -> last digit 5
Output: 1

--------------------------------------------------------------------------------

Sample 2:
Input : N = 10, D = 4
Step-by-step check:
  - 2^2 = 4  -> last digit 4 (MATCH! Count = 1)
  - 8^2 = 64 -> last digit 4 (MATCH! Count = 2)
Output: 2
================================================================================
*/
