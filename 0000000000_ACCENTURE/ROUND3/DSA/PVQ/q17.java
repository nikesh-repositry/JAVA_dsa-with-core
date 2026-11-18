/*
================================================================================
PROBLEM STATEMENT:
1. Java: Balanced Digit Number

Problem Description:
A positive integer is defined as a Balanced Digit Number if the sum of its 
digits at even positions equals the sum of its digits at odd positions.

Detailed Indexing & Algorithm Explanation:
- 1-Indexed Right-to-Left: Digits are indexed starting from the rightmost 
  (least significant) digit as position 1.
- Iterative Extraction: Using modulo 10 (n % 10), we extract the rightmost 
  digit. Then, using integer division (n / 10), we remove the rightmost digit. 
  We increment a position variable in each iteration to know whether to add 
  the digit to oddSum or evenSum.
================================================================================
*/

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public boolean isBalancedDigitNumber(int n) {
        
        // WHAT: Create variables to store the sum of digits at odd and even positions, 
        //       plus a position tracker starting at 1.
        // HOW: Initialize oddSum = 0, evenSum = 0, and position = 1.
        // WHY: The problem defines 1-indexed positions starting from the rightmost digit 
        //      as position 1, so we need to track which position we are currently reading.
        int oddSum = 0;
        int evenSum = 0;
        int position = 1;

        // WHAT: Loop through all digits of the number from right to left until n becomes 0.
        // HOW: Use a while loop with condition (n > 0).
        // WHY: Dividing n by 10 repeatedly removes one digit per step until no digits remain.
        while (n > 0) {
            
            // WHAT: Extract the rightmost (last) digit of n.
            // HOW: Use modulo 10 (n % 10).
            // WHY: Remainder after dividing by 10 always gives the digit in the ones place.
            int digit = n % 10;

            // WHAT: Add the extracted digit to either oddSum or evenSum based on its position.
            // HOW: Check if (position % 2 == 1) for odd positions; otherwise, it is even.
            // WHY: Separates the digits into two sums so we can compare them at the end.
            if (position % 2 == 1) {
                oddSum += digit;
            } else {
                evenSum += digit;
            }

            // WHAT: Remove the rightmost digit from n and move to the next position.
            // HOW: Divide n by 10 (n /= 10) and increment position (position++).
            // WHY: Prepares the next digit to the left for the next loop iteration.
            n /= 10;
            position++;
        }

        // WHAT: Return true if both sums are equal, otherwise false.
        // HOW: Evaluate the boolean expression (oddSum == evenSum).
        // WHY: A number is a Balanced Digit Number if and only if oddSum equals evenSum.
        return oddSum == evenSum;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Sample Test Case 1: Balanced Digit Number (1210 -> odd: 0+2=2, even: 1+1=2)
        int input1 = 1210;
        boolean output1 = obj.isBalancedDigitNumber(input1);
        System.out.println("Sample 1 Input : " + input1);
        System.out.println("Sample 1 Output: " + output1);

        System.out.println("------------------------------------");

        // Sample Test Case 2: Not a Balanced Digit Number (1234 -> odd: 4+2=6, even: 3+1=4)
        int input2 = 1234;
        boolean output2 = obj.isBalancedDigitNumber(input2);
        System.out.println("Sample 2 Input : " + input2);
        System.out.println("Sample 2 Output: " + output2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Sample 1:
Input : n = 1210
Step-by-step trace (Right-to-Left):
  - Position 1 (Odd) : digit = 0 -> oddSum = 0
  - Position 2 (Even): digit = 1 -> evenSum = 1
  - Position 3 (Odd) : digit = 2 -> oddSum = 0 + 2 = 2
  - Position 4 (Even): digit = 1 -> evenSum = 1 + 1 = 2
  - Compare: oddSum (2) == evenSum (2) -> true
Output: true

--------------------------------------------------------------------------------

Sample 2:
Input : n = 1234
Step-by-step trace (Right-to-Left):
  - Position 1 (Odd) : digit = 4 -> oddSum = 4
  - Position 2 (Even): digit = 3 -> evenSum = 3
  - Position 3 (Odd) : digit = 2 -> oddSum = 4 + 2 = 6
  - Position 4 (Even): digit = 1 -> evenSum = 3 + 1 = 4
  - Compare: oddSum (6) == evenSum (4) -> false
Output: false
================================================================================
*/
