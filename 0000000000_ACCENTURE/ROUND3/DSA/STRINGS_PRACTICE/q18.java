// Problem: Find and return the shortest word in a given sentence.

import java.util.*;

class Solution18 {
    public String findShortestWord(String sentence) {
        // Logic: Split the sentence into words.
        // Start by assuming the first word is the shortest, then update whenever a shorter word is found.
        String[] words = sentence.trim().split("\\s+");
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        String sentence = "Java programming is super fun"; // Input
        String result = sol.findShortestWord(sentence);
        System.out.println(result);
        // Output: is
    }
}
