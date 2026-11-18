// Problem: Find and return the longest word in a given sentence.

import java.util.*;

class Solution17 {
    public String findLongestWord(String sentence) {
        // Logic: Split the sentence into words by spaces.
        // Keep track of 'longest' and replace it whenever a word with greater length appears.
        String[] words = sentence.trim().split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Solution17 sol = new Solution17();
        String sentence = "Java programming is super fun"; // Input
        String result = sol.findLongestWord(sentence);
        System.out.println(result);
        // Output: programming
    }
}
