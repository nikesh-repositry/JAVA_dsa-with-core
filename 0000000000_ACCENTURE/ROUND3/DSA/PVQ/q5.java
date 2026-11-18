/*
================================================================================
PROBLEM STATEMENT:
You are given a target positive integer N (e.g., 112).
For any integer X, define its Equivalent Sum (EqSum(X)) as the sum of all prefix 
sub-numbers formed by reading X from left to right.

Specifically, if X is represented as a string of digits d1 d2 ... dk:
  EqSum(X) = d1 + int(d1 d2) + ... + int(d1 d2 ... dk)

For example, for X = 112:
  EqSum(112) = 1 + 11 + 112 = 124

Goal: Count (or list) all integers X such that:
  1. 1 <= X < N
  2. EqSum(X) > N
================================================================================
*/

import java.util.ArrayList;
import java.util.List;

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    // Note: Returns the count of valid numbers (and also includes a helper to list them).
    public int countValidNumbers(int N) {
        
        // WHAT: Track how many numbers X satisfy both rules.
        // HOW: Initialize count = 0.
        // WHY: The primary goal is to count all integers X in [1, N - 1] with EqSum(X) > N.
        int count = 0;

        // WHAT: Loop through every possible integer X from 1 up to N - 1.
        // HOW: Standard for-loop starting at X = 1 while X < N.
        // WHY: Rule 1 strictly states that 1 <= X < N.
        for (int x = 1; x < N; x++) {
            
            // WHAT: Calculate EqSum(X) for the current number x.
            // HOW: Call our easy helper method getEqSum(x).
            // WHY: Keeping prefix-sum logic in a helper method makes the code clean and readable.
            int eqSum = getEqSum(x);

            // WHAT: Check if the Equivalent Sum is strictly greater than N.
            // HOW: Compare eqSum > N.
            // WHY: Rule 2 requires EqSum(X) > N for x to be counted as valid.
            if (eqSum > N) {
                count++;
            }
        }

        return count;
    }

    // HELPER FUNCTION: Calculates EqSum(X) using simple string prefixes
    private int getEqSum(int x) {
        
        // WHAT: Convert the integer x into a String so we can easily grab prefixes.
        // HOW: Use String.valueOf(x).
        // WHY: Reading digits from left to right is much easier with String.substring().
        String s = String.valueOf(x);
        int sum = 0;

        // WHAT: Loop through every prefix length from 1 up to the full string length.
        // HOW: Loop i from 1 to s.length(), take substring(0, i), convert to int, and add.
        // WHY: For "112", i=1 gives "1", i=2 gives "11", i=3 gives "112" -> 1 + 11 + 112 = 124.
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            sum += Integer.parseInt(prefix);
        }

        return sum;
    }

    // BONUS HELPER: In case your platform asks for the actual list of valid numbers
    public List<Integer> listValidNumbers(int N) {
        List<Integer> validList = new ArrayList<>();
        for (int x = 1; x < N; x++) {
            if (getEqSum(x) > N) {
                validList.add(x);
            }
        }
        return validList;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Test Case 1 from the problem image
        int N = 112;
        int countOutput = obj.countValidNumbers(N);
        List<Integer> listOutput = obj.listValidNumbers(N);

        System.out.println("Input N            : " + N);
        System.out.println("Valid Count Output : " + countOutput);
        System.out.println("Valid Numbers List : " + listOutput);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Test Case 1 (From Image):
Input : N = 112

Step-by-step check:
  - X = 99  -> EqSum(99)  = 9 + 99        = 108 (108 <= 112 -> Invalid)
  - X = 101 -> EqSum(101) = 1 + 10 + 101  = 112 (112 <= 112 -> Invalid)
  - X = 102 -> EqSum(102) = 1 + 10 + 102  = 113 (113 > 112  -> Valid)
  - X = 105 -> EqSum(105) = 1 + 10 + 105  = 116 (116 > 112  -> Valid)
  ... up to X = 111.

Valid Numbers (X < 112): [102, 103, 104, 105, 106, 107, 108, 109, 110, 111]
Output (Count): 10
================================================================================
*/
