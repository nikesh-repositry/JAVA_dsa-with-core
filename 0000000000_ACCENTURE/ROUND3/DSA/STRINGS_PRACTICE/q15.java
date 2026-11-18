// Problem: Reverse the order of words in a given sentence while removing extra spaces.

import java.util.*;

class Solution15 {
    public String reverseWords(String s) {
        // Logic: Trim outer spaces and split the string by one or more spaces ("\\s+").
        // Loop backward through the words array and join them with a single space.
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        String s = "  the sky is blue  "; // Input
        String result = sol.reverseWords(s);
        System.out.println(result);
        // Output: blue is sky the
    }
}
