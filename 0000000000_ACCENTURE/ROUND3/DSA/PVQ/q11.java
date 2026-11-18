/*
================================================================================
PROBLEM STATEMENT:
Sum of Digits Until Single Digit (Add Digits)

Question Details: Given a number (e.g., 38), continuously add all its digits 
until the result is a single digit.

Example: 38 -> 3 + 8 = 11 -> 1 + 1 = 2. Output = 2.
================================================================================
*/

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int addDigits(int num) {
        
        // WHAT: Keep repeating the digit-addition process as long as num has 2 or more digits.
        // HOW: Use a while loop with the condition (num >= 10).
        // WHY: Any non-negative integer less than 10 (0 to 9) is already a single digit, 
        //      so we stop immediately once num drops below 10.
        while (num >= 10) {
            
            // WHAT: Create a temporary variable to store the sum of digits for the current round.
            // HOW: Initialize sum = 0 at the start of each round.
            // WHY: We need a fresh sum every time we break down a multi-digit number.
            int sum = 0;

            // WHAT: Extract every digit of the current num from right to left and add it to sum.
            // HOW: Loop while (num > 0), add (num % 10) to sum, and shrink num using (num /= 10).
            // WHY: (num % 10) isolates the last digit, and (num /= 10) removes that last digit.
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            // WHAT: Replace num with the newly calculated sum of its digits.
            // HOW: Assign num = sum.
            // WHY: If this new sum still has 2 or more digits (e.g., 11), the outer loop 
            //      will run again to add its digits (1 + 1 = 2).
            num = sum;
        }

        return num;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Example from the problem image
        int input1 = 38;
        int output1 = obj.addDigits(input1);
        System.out.println("Sample 1 Input : " + input1);
        System.out.println("Sample 1 Output: " + output1);

        System.out.println("------------------------------------");

        // Sample Test Case 2: Single digit / zero edge case
        int input2 = 9875;
        int output2 = obj.addDigits(input2);
        System.out.println("Sample 2 Input : " + input2);
        System.out.println("Sample 2 Output: " + output2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Sample 1 (From Image):
Input : num = 38
Step-by-step trace:
  - Round 1: 38 >= 10 -> 3 + 8 = 11 -> num becomes 11
  - Round 2: 11 >= 10 -> 1 + 1 = 2  -> num becomes 2
  - Loop stops because 2 < 10.
Output: 2

--------------------------------------------------------------------------------

Sample 2:
Input : num = 9875
Step-by-step trace:
  - Round 1: 9 + 8 + 7 + 5 = 29
  - Round 2: 2 + 9 = 11
  - Round 3: 1 + 1 = 2
Output: 2
================================================================================
*/
