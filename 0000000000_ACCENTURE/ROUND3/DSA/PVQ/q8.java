/*
================================================================================
PROBLEM STATEMENT:
Array Digital Length & Digit Operations

Given an array of integers A of length N, inspect the number of digits (digital 
length) of each element and compute specific conditional operations based on 
Accenture slot variations.

PRIMARY EXAM VARIANT: CONDITIONAL DIGIT-LENGTH SUM
Calculate the sum of elements after applying digit-length rules:
- If digit length is Even: Add the square of the element's digit length to total.
- If digit length is Odd: Add the sum of individual digits of that number to total.
================================================================================
*/

import java.util.Arrays;

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int conditionalDigitLengthSum(int N, int[] A) {
        
        // WHAT: Track the final running sum after applying the rules to every element.
        // HOW: Initialize totalSum = 0.
        // WHY: We need to accumulate the transformed value of all N numbers in the array.
        int totalSum = 0;

        // WHAT: Loop through every number in the array A.
        // HOW: Standard for-loop from i = 0 up to N - 1.
        // WHY: Each element must be inspected individually to check if its digit count is even or odd.
        for (int i = 0; i < N; i++) {
            
            // WHAT: Take the absolute value of the current element so negative signs don't count as digits.
            // HOW: Use Math.abs(A[i]).
            // WHY: Ensures both positive and negative integers (like -12) are handled safely.
            int num = Math.abs(A[i]);

            // WHAT: Convert the number to a String to find its exact digit length easily.
            // HOW: Use String.valueOf(num) and check s.length().
            // WHY: Converting to String handles 0 properly (length 1) and avoids complex log10 math.
            String s = String.valueOf(num);
            int digitLength = s.length();

            // WHAT: Check if the digit length is Even or Odd and apply the matching rule.
            // HOW: Use (digitLength % 2 == 0) to test for even length.
            // WHY: Even length adds (digitLength * digitLength), while Odd length adds the sum of digits.
            if (digitLength % 2 == 0) {
                totalSum += (digitLength * digitLength);
            } else {
                totalSum += getDigitSum(num);
            }
        }

        return totalSum;
    }

    // HELPER FUNCTION: Calculates the sum of individual digits of a number
    private int getDigitSum(int num) {
        int sum = 0;

        // WHAT: Extract each digit from right to left and add it to sum.
        // HOW: Use (num % 10) to grab the last digit, then divide by 10 (num /= 10) to remove it.
        // WHY: Standard modulo-10 loop is the easiest way to sum all digits of an integer.
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Exam Test Case Example from the problem image
        int N = 4;
        int[] A = {12, 345, 7, 8888};
        
        int output = obj.conditionalDigitLengthSum(N, A);
        System.out.println("Input  : N = " + N + ", A = " + Arrays.toString(A));
        System.out.println("Output : " + output);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Exam Test Case Example (From Image):
Input : N = 4, A = [12, 345, 7, 8888]

Step-by-step calculation:
  - 12   -> length 2 (Even) -> 2^2 = 4
  - 345  -> length 3 (Odd)  -> 3 + 4 + 5 = 12
  - 7    -> length 1 (Odd)  -> 7
  - 8888 -> length 4 (Even) -> 4^2 = 16

Total Output: 4 + 12 + 7 + 16 = 39
================================================================================
*/
