/*
================================================================================
PROBLEM STATEMENT:
Given a string (may contain multiple spaces), find the first + last character 
combination of each word. 
Then return the combination(s) with the highest frequency, maintaining the 
original order of appearance.
================================================================================
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public List<String> mostFrequentCombination(String s) {
        
        // WHAT: Create an empty list to store the final result.
        // HOW: Initialize a standard ArrayList of Strings.
        // WHY: We will return this immediately if input is empty, or fill it with winners later.
        List<String> result = new ArrayList<>();
        if (s == null || s.trim().isEmpty()) {
            return result;
        }

        // WHAT: Clean extra spaces and break the sentence into individual words.
        // HOW: s.trim() removes outer spaces; split("\\s+") splits on 1 or more spaces.
        // WHY: Prevents multiple consecutive spaces from creating empty word strings.
        String[] words = s.trim().split("\\s+");

        // WHAT: Create a map to store each "first+last" combination and its frequency.
        // HOW: Use LinkedHashMap<String, Integer> to map combination -> count.
        // WHY: LinkedHashMap preserves the exact insertion order, which is required 
        //      to return ties in their original order of appearance.
        Map<String, Integer> freq = new LinkedHashMap<>();

        // WHAT: Loop through every word to build its combination and count occurrences.
        // HOW: Enhanced for-loop over the words array.
        // WHY: Every word contributes one first+last pair to our frequency count.
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            // WHAT: Extract the first and last characters and join them into a String.
            // HOW: Concatenate "" + charAt(0) + charAt(length - 1).
            // WHY: Starting with "" converts the characters into a String instead of adding their ASCII numbers.
            String combo = "" + word.charAt(0) + word.charAt(word.length() - 1);

            // WHAT: Add 1 to the existing count of this combination in the map.
            // HOW: freq.getOrDefault(combo, 0) + 1 fetches old count (or 0) and increments it.
            // WHY: Cleanly updates the frequency without needing an if-else check.
            freq.put(combo, freq.getOrDefault(combo, 0) + 1);
        }

        // WHAT: Find the highest frequency among all combinations.
        // HOW: Collections.max(freq.values()) scans all values in the map and returns the largest.
        // WHY: Much shorter and cleaner than tracking maxFreq manually inside the loop.
        int maxFreq = Collections.max(freq.values());

        // WHAT: Collect all combinations whose frequency matches maxFreq.
        // HOW: Loop through freq.entrySet() to check both key and value together.
        // WHY: Faster than looking up keys again, and LinkedHashMap guarantees original order.
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Exact test input from your reference image
        String s = "aaa human   achinh ae add  ad admind ";
        
        // Call the function using the object and print output
        List<String> output = obj.mostFrequentCombination(s);
        System.out.println("Input : \"" + s + "\"");
        System.out.println("Output: " + output);
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT (From Reference Image):

Input : "aaa human   achinh ae add  ad admind "

Step-by-step word breakdown:
  - "aaa"    -> "aa" (count = 1)
  - "human"  -> "hn" (count = 1)
  - "achinh" -> "ah" (count = 1)
  - "ae"     -> "ae" (count = 1)
  - "add"    -> "ad" (count = 1)
  - "ad"     -> "ad" (count = 2)
  - "admind" -> "ad" (count = 3)

Max Frequency = 3 ("ad")

Output: [ad]
================================================================================
*/
