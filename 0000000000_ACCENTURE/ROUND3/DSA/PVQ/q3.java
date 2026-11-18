/*
================================================================================
PROBLEM STATEMENT:
You are given an integer array A, where each N element represents the bloom time 
(in days) of a flower. You have to transform the array using the following rules:
- For each element A[i], keep it same only if it satisfies both of the following 
  Balanced Bloom conditions:
    1. The number of flowers that bloom before it (i.e., have bloom time less than A[i]) 
       is equal to the number of flowers that bloom after it (i.e., have bloom time 
       greater than A[i]).
    2. The number of flowers that bloom on the same day (i.e., have the same value 
       as A[i]) is less than 3 (i.e., at most 2).
- If both conditions are not met, replace A[i] with 0.

Your task is to transform the array and return an integer value representing the 
sum of the flowers of the transformed array. If no element satisfies the Balanced 
Bloom conditions, return the sum of the original array.

Input Specification:
input1 : An integer value N, representing the number of flowers.
input2 : An integer array A, representing the bloom time of flowers.

Output Specification:
Return an integer value representing the sum of the elements of the transformed 
array. If no element satisfies the Balanced Bloom conditions, return the sum of 
the original array.
================================================================================
*/

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int balancedBloomSum(int input1, int[] input2) {
        
        // WHAT: Track the sum of balanced elements, the sum of all original elements, and a flag.
        // HOW: Initialize transformedSum = 0, originalSum = 0, and anySatisfied = false.
        // WHY: If no element meets the Balanced Bloom conditions, the problem requires us to 
        //      fall back and return originalSum instead of 0.
        int transformedSum = 0;
        int originalSum = 0;
        boolean anySatisfied = false;

        // WHAT: Outer loop to inspect each flower A[i] one by one.
        // HOW: Loop index i from 0 to input1 - 1.
        // WHY: We need to test every single element against the rest of the array.
        for (int i = 0; i < input1; i++) {
            int current = input2[i];
            
            // Add current element to originalSum in case no flower passes the test
            originalSum += current;

            // WHAT: Counters for flowers blooming before, after, and on the same day.
            // HOW: Reset lessCount, greaterCount, and sameCount to 0 for each flower.
            // WHY: Each flower needs a fresh comparison against all N flowers in the array.
            int lessCount = 0;
            int greaterCount = 0;
            int sameCount = 0;

            // WHAT: Inner loop to compare the current flower with every flower in the array.
            // HOW: Loop index j from 0 to input1 - 1 and increment the matching counter.
            // WHY: This gives us the exact counts needed to check both Balanced Bloom rules.
            for (int j = 0; j < input1; j++) {
                if (input2[j] < current) {
                    lessCount++;
                } else if (input2[j] > current) {
                    greaterCount++;
                } else {
                    sameCount++; // Includes input2[i] itself, so sameCount is at least 1
                }
            }

            // WHAT: Check if both Balanced Bloom conditions are true.
            // HOW: Verify (lessCount == greaterCount) AND (sameCount < 3).
            // WHY: Only flowers meeting both rules stay unchanged (added to transformedSum); 
            //      all others become 0 (so they add nothing to transformedSum).
            if (lessCount == greaterCount && sameCount < 3) {
                transformedSum += current;
                anySatisfied = true;
            }
        }

        // WHAT: Return the final answer based on whether at least one flower qualified.
        // HOW: Use a ternary operator: if anySatisfied is true, return transformedSum; else originalSum.
        // WHY: Directly fulfills the fallback rule when all elements turn into 0.
        return anySatisfied ? transformedSum : originalSum;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class
        Solution obj = new Solution();

        // Example 1 from the problem image
        int input1 = 7;
        int[] input2 = {4, 2, 5, 3, 5, 1, 2};
        
        int result1 = obj.balancedBloomSum(input1, input2);
        System.out.println("Example 1 Output: " + result1);

        // Example 2: Edge case where NO element satisfies the condition (falls back to original sum)
        int input1_edge = 3;
        int[] input2_edge = {2, 2, 2};
        
        int result2 = obj.balancedBloomSum(input1_edge, input2_edge);
        System.out.println("Example 2 Output: " + result2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Example 1 (From Image):
Input:
  input1 = 7
  input2 = {4, 2, 5, 3, 5, 1, 2}

Step-by-step check:
  - 4 -> before: 4 ({2,3,1,2}), after: 2 ({5,5}) -> Not equal -> 0
  - 2 -> before: 1 ({1}), after: 4 ({4,5,3,5}) -> Not equal -> 0
  - 5 -> before: 5 ({4,2,3,1,2}), after: 0 -> Not equal -> 0
  - 3 -> before: 3 ({2,1,2}), after: 3 ({4,5,5}), same: 1 (< 3) -> BALANCED! Keep 3
  - 5 -> before: 5, after: 0 -> Not equal -> 0
  - 1 -> before: 0, after: 6 -> Not equal -> 0
  - 2 -> before: 1, after: 4 -> Not equal -> 0

Transformed Array = {0, 0, 0, 3, 0, 0, 0}
Output: 3

--------------------------------------------------------------------------------

Example 2 (Fallback Case):
Input:
  input1 = 3
  input2 = {2, 2, 2}

Step-by-step check:
  - Every 2 has sameCount = 3 (fails "less than 3" condition).
  - Transformed Array = {0, 0, 0} (No element satisfied the conditions).
  - Fallback to sum of original array = 2 + 2 + 2 = 6.

Output: 6
================================================================================
*/
