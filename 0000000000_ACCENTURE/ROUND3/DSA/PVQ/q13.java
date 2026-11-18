/*
================================================================================
PROBLEM STATEMENT:
Given a string (e.g., "ababc"), for each unique character, calculate the 
product of its ASCII value and its total frequency in the string. Take 
(product % 5). If the resulting value is non-zero, add it to a running sum. 
Process each unique character only once regardless of how many times it appears.
================================================================================
*/

import java.util.HashMap;
import java.util.Map;

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public int uniqueCharAsciiProductSum(String s) {
        
        // WHAT: Handle null or empty string edge cases safely.
        // HOW: Return 0 immediately if s is null or empty.
        // WHY: An empty string has no characters, so the running sum is 0.
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // WHAT: Create a HashMap to count the total frequency of each unique character.
        // HOW: Map each Character to its Integer occurrence count.
        // WHY: HashMap automatically groups duplicate characters together so we get 
        //      both the total frequency and a clean list of unique keys.
        Map<Character, Integer> freqMap = new HashMap<>();

        // WHAT: Loop through every character in the string to build the frequency map.
        // HOW: Convert string to char array using s.toCharArray() and update counts.
        // WHY: We need each character's total frequency before calculating its product.
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // WHAT: Track the running sum of valid remainder values.
        // HOW: Initialize runningSum = 0.
        // WHY: Accumulates (product % 5) for every unique character where remainder != 0.
        int runningSum = 0;

        // WHAT: Loop through each unique character entry in the map only once.
        // HOW: Iterate over freqMap.entrySet() to access both character and frequency.
        // WHY: Iterating over the map guarantees each unique character is processed once.
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            
            // WHAT: Get the character's ASCII value and its frequency.
            // HOW: Cast the Character key to int for ASCII, and get the Integer value.
            // WHY: In Java, casting a char to (int) directly gives its ASCII/Unicode value.
            int asciiValue = (int) entry.getKey();
            int frequency = entry.getValue();

            // WHAT: Compute the product and find its remainder when divided by 5.
            // HOW: Multiply asciiValue * frequency, then take (% 5).
            // WHY: Directly implements the formula given in the problem statement.
            int product = asciiValue * frequency;
            int remainder = product % 5;

            // WHAT: Add the remainder to runningSum if it is non-zero.
            // HOW: Check if (remainder != 0) and add it using +=.
            // WHY: Adding 0 wouldn't change the sum anyway, and this matches the exact rule.
            if (remainder != 0) {
                runningSum += remainder;
            }
        }

        return runningSum;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Example from the problem image
        String input1 = "ababc";
        int output1 = obj.uniqueCharAsciiProductSum(input1);
        System.out.println("Sample 1 Input : \"" + input1 + "\"");
        System.out.println("Sample 1 Output: " + output1);

        System.out.println("------------------------------------");

        // Sample Test Case 2
        String input2 = "hello";
        int output2 = obj.uniqueCharAsciiProductSum(input2);
        System.out.println("Sample 2 Input : \"" + input2 + "\"");
        System.out.println("Sample 2 Output: " + output2);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT:

Sample 1 (From Image):
Input : s = "ababc"
Step-by-step calculation:
  - 'a' (ASCII 97), frequency = 2 -> product = 97 * 2 = 194 -> 194 % 5 = 4 (non-zero -> add 4)
  - 'b' (ASCII 98), frequency = 2 -> product = 98 * 2 = 196 -> 196 % 5 = 1 (non-zero -> add 1)
  - 'c' (ASCII 99), frequency = 1 -> product = 99 * 1 = 99  -> 99 % 5  = 4 (non-zero -> add 4)
Output: 9  (4 + 1 + 4)

--------------------------------------------------------------------------------

Sample 2:
Input : s = "hello"
Step-by-step calculation:
  - 'h' (ASCII 104), freq = 1 -> 104 * 1 = 104 -> 104 % 5 = 4
  - 'e' (ASCII 101), freq = 1 -> 101 * 1 = 101 -> 101 % 5 = 1
  - 'l' (ASCII 108), freq = 2 -> 108 * 2 = 216 -> 216 % 5 = 1
  - 'o' (ASCII 111), freq = 1 -> 111 * 1 = 111 -> 111 % 5 = 1
Output: 7  (4 + 1 + 1 + 1)
================================================================================
*/
