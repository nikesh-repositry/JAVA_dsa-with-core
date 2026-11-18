// Problem: Replace all occurrences of 'oldChar' with 'newChar' without using String.replace().

import java.util.*;

class Solution20 {
    public String replaceChar(String s, char oldChar, char newChar) {
        // Logic: Convert the string into a character array so we can modify positions directly.
        // Loop through the array and swap any matching 'oldChar' with 'newChar', then convert back to String.
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        String s = "banana"; // Input string
        char oldChar = 'a'; // Input old char
        char newChar = 'o'; // Input new char
        String result = sol.replaceChar(s, oldChar, newChar);
        System.out.println(result);
        // Output: bonono
    }
}
