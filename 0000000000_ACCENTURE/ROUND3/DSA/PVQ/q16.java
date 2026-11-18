/*
================================================================================
PROBLEM STATEMENT:
Problem Description: One string is given and we need to perform manipulation on 
it. For each character, find its modulo 26 value (char_code % 26). If the 
remainder is 0, reset it to 26, then convert it back to character format via 
explicit character type casting. If any whitespace character is encountered, 
preserve it as a space in the answer string.
================================================================================
*/

class Solution {

    // 1. LEETCODE-STYLE SOLUTION FUNCTION
    public String transformAsciiMod26(String s) {
        
        // WHAT: Handle null input safely.
        // HOW: Return an empty string if s is null.
        // WHY: Prevents a NullPointerException when calling s.toCharArray().
        if (s == null) {
            return "";
        }

        // WHAT: Create a StringBuilder to build our final answer character by character.
        // HOW: Initialize an empty StringBuilder named result.
        // WHY: Appending to a StringBuilder is much faster and cleaner than concatenating 
        //      normal Strings inside a loop.
        StringBuilder result = new StringBuilder();

        // WHAT: Loop through every character in the input string.
        // HOW: Convert s into a char array using s.toCharArray() and iterate with an enhanced loop.
        // WHY: Each character must be checked individually for whitespace or modulo 26 transformation.
        for (char ch : s.toCharArray()) {
            
            // WHAT: Check if the current character is any whitespace character.
            // HOW: Use Character.isWhitespace(ch) and append a regular space ' ' if true.
            // WHY: The problem explicitly states to preserve any whitespace as a space in the answer.
            if (Character.isWhitespace(ch)) {
                result.append(' ');
            } else {
                // WHAT: Find the ASCII code's remainder when divided by 26.
                // HOW: Compute int rem = (int) ch % 26.
                // WHY: Casting ch to (int) gets its ASCII value so we can apply modulo 26.
                int rem = (int) ch % 26;

                // WHAT: Reset the remainder to 26 if it equals 0.
                // HOW: Check if (rem == 0) and assign rem = 26.
                // WHY: Follows the exact rule: "If the remainder is 0, reset it to 26".
                if (rem == 0) {
                    rem = 26;
                }

                // WHAT: Convert the integer remainder back to a character and append it.
                // HOW: Explicitly cast (char) rem and add it to result.
                // WHY: Produces the exact ASCII control character matching values 1 through 26.
                result.append((char) rem);
            }
        }

        return result.toString();
    }

    // 2. MAIN METHOD (PSVM) TO PASS INPUT USING OBJECT
    public static void main(String[] args) {
        // Create an object of Solution class (LeetCode style)
        Solution obj = new Solution();

        // Helper display note: ASCII values 1..26 are non-printable control characters
        // (e.g., 13 is '\r' carriage return), so we print both the string and its hex/int codes.
        String[] testInputs = {"Abc", "A Z", "Hello World"};

        for (String input : testInputs) {
            String output = obj.transformAsciiMod26(input);
            System.out.print("Input: \"" + input + "\" -> Char Codes: ");
            for (char c : output.toCharArray()) {
                if (c == ' ') {
                    System.out.print("[SPACE] ");
                } else {
                    System.out.printf("\\x%02x ", (int) c);
                }
            }
            System.out.println();
        }
    }
}

/*
================================================================================
SAMPLE INPUT AND OUTPUT (From Verified Test Cases Image):

Test Case 1:
Input : "Abc"
Step-by-step calculation:
  - 'A' (65) -> 65 % 26 = 13 -> (char) 13 = '\r' (0x0d)
  - 'b' (98) -> 98 % 26 = 20 -> (char) 20 = '\u0014' (Note: image shows \x1c = 28, standard 98%26 is 20)
  - 'c' (99) -> 99 % 26 = 21 -> (char) 21 = '\u0015'
Output: String with char codes [13, 20, 21]

--------------------------------------------------------------------------------

Test Case 2:
Input : "A Z"
Step-by-step calculation:
  - 'A' (65) -> 65 % 26 = 13 -> (char) 13 = '\r'
  - ' '      -> preserved as ' '
  - 'Z' (90) -> 90 % 26 = 12 -> (char) 12 = '\f'
Output: String with char codes [13, ' ', 12]

--------------------------------------------------------------------------------

Test Case 3:
Input : "Hello World"
Step-by-step calculation:
  - 'H' (72) -> 72 % 26 = 20
  - 'e' (101) -> 101 % 26 = 23
  - 'l' (108) -> 108 % 26 = 4
  - 'l' (108) -> 108 % 26 = 4
  - 'o' (111) -> 111 % 26 = 7
  - ' ' -> ' '
  - 'W' (87) -> 87 % 26 = 9
  - 'o' (111) -> 111 % 26 = 7
  - 'r' (114) -> 114 % 26 = 10
  - 'l' (108) -> 108 % 26 = 4
  - 'd' (100) -> 100 % 26 = 22
Output: String with char codes [20, 23, 4, 4, 7, ' ', 9, 7, 10, 4, 22]
================================================================================
*/
