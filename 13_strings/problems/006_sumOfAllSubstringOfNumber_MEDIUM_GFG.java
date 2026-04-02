class Solution {
    public int sumSubstrings(String s) {
        int n = s.length();
        int totalSum = 0;
        
        // currentSum stores the sum of all substrings ending at the current character
        int currentSumEndingAtI = 0;

        for (int i = 0; i < n; i++) {
            // Convert character to its integer value
            int digit = s.charAt(i) - '0';

            // Calculate sum of substrings ending at index i
            // Formula: (10 * previous_ending_sum) + (count_of_substrings * current_digit)
            currentSumEndingAtI = (10 * currentSumEndingAtI) + (i + 1) * digit;

            // Add the current result to the final total
            totalSum += currentSumEndingAtI;
        }

        return totalSum;
    }
}
/*
Initial Setup
s = "9567"

n = 4

totalSum = 0

currentSumEndingAtI = 0

Iteration 1 (i = 0, digit = 9)
Formula:
currentSumEndingAtI = (10 * 0) + (1 * 9) = 9  
totalSum = 0 + 9 = 9

State:

currentSumEndingAtI = 9

totalSum = 9

Iteration 2 (i = 1, digit = 5)
Formula:
currentSumEndingAtI = (10 * 9) + (2 * 5) = 90 + 10 = 100  
totalSum = 9 + 100 = 109

State:

currentSumEndingAtI = 100

totalSum = 109

Iteration 3 (i = 2, digit = 6)
Formula:
currentSumEndingAtI = (10 * 100) + (3 * 6) = 1000 + 18 = 1018  
totalSum = 109 + 1018 = 1127

State:

currentSumEndingAtI = 1018

totalSum = 1127

Iteration 4 (i = 3, digit = 7)
Formula:
currentSumEndingAtI = (10 * 1018) + (4 * 7) = 10180 + 28 = 10208  
totalSum = 1127 + 10208 = 11335

State:

currentSumEndingAtI = 10208

totalSum = 11335

✅ Final Answer
totalSum = 11335*/
